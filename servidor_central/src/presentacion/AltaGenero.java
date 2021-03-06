package presentacion;

import espotify.Fabrica;
import espotify.datatypes.DataGenero;
import espotify.excepciones.GeneroInexistenteException;
import espotify.excepciones.GeneroRepetidoException;
import espotify.interfaces.IAltaGenero;

import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author JavierM42
 */
public class AltaGenero extends javax.swing.JInternalFrame {

    private DefaultTreeModel modeloTree;
    
    /**
     * Creates new form AltaGenero
     */
    public AltaGenero() {
        initComponents();
        ArbolGeneros.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        IAltaGenero inter =  Fabrica.getIAltaGenero();                 
        DataGenero generoBase = inter.listarGeneros();
        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode(generoBase.getNombre());
        modeloTree  = new DefaultTreeModel(raiz);
        ArbolGeneros.setModel(modeloTree);
        cargarArbol(generoBase, raiz);

    }
    
    private void cargarArbol(DataGenero dataGenero, DefaultMutableTreeNode padre) {
        int idx = 0;
        for (DataGenero d: dataGenero.getHijos()) {
            DefaultMutableTreeNode nodito = new DefaultMutableTreeNode(d.getNombre());
            modeloTree.insertNodeInto(nodito, padre, idx);
            idx++;
            cargarArbol(d, nodito);
        }
        for (idx = 0; idx < ArbolGeneros.getRowCount(); idx++) {
            ArbolGeneros.expandRow(idx);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ArbolGeneros = new javax.swing.JTree();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomtxt = new javax.swing.JTextField();
        confirmarbtn = new javax.swing.JButton();

        setClosable(true);
        setTitle("Alta de Género");

        ArbolGeneros.setModel(null);
        jScrollPane1.setViewportView(ArbolGeneros);

        jLabel1.setText("Padre:");

        jLabel2.setText("Nombre:");

        confirmarbtn.setText("Confirmar");
        confirmarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confirmarbtn)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(nomtxt))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmarbtn))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarbtnActionPerformed
        try {
            String nom = nomtxt.getText();
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) ArbolGeneros.getLastSelectedPathComponent();
            String nomPadre = "";
            if (node != null) {
                nomPadre = (String) node.getUserObject();
            }
            IAltaGenero ctrl = Fabrica.getIAltaGenero();
            ctrl.altaGenero(new DataGenero(nom, nomPadre));
            JOptionPane.showMessageDialog(this, "Operación completada con éxito.", "OK", JOptionPane.PLAIN_MESSAGE);
            this.dispose();
        } catch (GeneroRepetidoException ex) {
            JOptionPane.showMessageDialog(this, "Ya existe un género con ese nombre.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (GeneroInexistenteException ex) {
            JOptionPane.showMessageDialog(this, "El género padre no existe.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_confirmarbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree ArbolGeneros;
    private javax.swing.JButton confirmarbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomtxt;
    // End of variables declaration//GEN-END:variables
}
