package presentacion;

import espotify.Fabrica;
import espotify.datatypes.DataAlbum;
import espotify.datatypes.DataDefecto;
import espotify.datatypes.DataParticular;
import espotify.datatypes.DataTema;
import espotify.excepciones.AlbumInexistenteException;
import espotify.excepciones.ArtistaInexistenteException;
import espotify.excepciones.ClienteInexistenteException;
import espotify.excepciones.FavoritoRepetidoException;
import espotify.excepciones.ListaInexistenteException;
import espotify.interfaces.IDesFavoritear;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author JavierM42
 */
public class DesFavoritear extends javax.swing.JInternalFrame {

    /**
     * Creates new form DesFavoritear
     */
    public DesFavoritear() {
        initComponents();
        IDesFavoritear ifav = Fabrica.getIDesFavoritear();
        List<String> cli = ifav.listarClientes();
        for(String c : cli) {
            clientescmb.addItem(c);
            lstpubclicmb.addItem(c);
        }
        cli = ifav.listarListasDefecto();
        for (String c : cli) {
            lstdefcmb.addItem(c);
        }
        cli = ifav.listarArtistas();
        for (String c : cli) {
            artcmb.addItem(c);
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

        jLabel1 = new javax.swing.JLabel();
        btnListaPublica = new javax.swing.JButton();
        btnAlbum = new javax.swing.JButton();
        btnTemaAlbum = new javax.swing.JButton();
        btnListaDefecto = new javax.swing.JButton();
        clientescmb = new javax.swing.JComboBox<>();
        lstpubclicmb = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lstdefcmb = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        artcmb = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tematxt = new javax.swing.JTextField();
        lstpubcmb = new javax.swing.JComboBox<>();
        albcmb = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Quitar de Favoritos");

        jLabel1.setText("Cliente");

        btnListaPublica.setText("Quitar de Favoritos");
        btnListaPublica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaPublicaActionPerformed(evt);
            }
        });

        btnAlbum.setText("Quitar de Favoritos");
        btnAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlbumActionPerformed(evt);
            }
        });

        btnTemaAlbum.setText("Quitar de Favoritos");
        btnTemaAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemaAlbumActionPerformed(evt);
            }
        });

        btnListaDefecto.setText("Quitar de Favoritos");
        btnListaDefecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaDefectoActionPerformed(evt);
            }
        });

        lstpubclicmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstpubclicmbActionPerformed(evt);
            }
        });

        jLabel5.setText("Lista Pública:");

        jLabel6.setText("Cliente:");

        jLabel7.setText("Lista:");

        jLabel8.setText("Lista por Defecto:");

        jLabel9.setText("Nombre de Lista:");

        lstdefcmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel10.setText("Álbum:");

        jLabel11.setText("Artista:");

        artcmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artcmbActionPerformed(evt);
            }
        });

        jLabel12.setText("Álbum:");

        jLabel13.setText("Tema:");

        albcmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albcmbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListaPublica)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(btnListaDefecto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tematxt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(btnAlbum))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(lstpubclicmb, 0, 116, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(lstpubcmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clientescmb, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lstdefcmb, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(artcmb, 0, 101, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11))
                                    .addComponent(jLabel12)
                                    .addComponent(albcmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(btnTemaAlbum)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clientescmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lstpubclicmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lstdefcmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12))
                        .addGap(7, 7, 7)
                        .addComponent(albcmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnListaPublica)
                            .addComponent(btnListaDefecto)
                            .addComponent(btnAlbum)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(artcmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lstpubcmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tematxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTemaAlbum)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListaDefectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaDefectoActionPerformed
        DataDefecto dataLista = new DataDefecto("", String.valueOf(lstdefcmb.getSelectedItem()), null);
        IDesFavoritear ifav = Fabrica.getIDesFavoritear();
        try {
            ifav.desFavoritear(String.valueOf(clientescmb.getSelectedItem()), dataLista);
            JOptionPane.showMessageDialog(this, "Operación completada con éxito.", "OK", JOptionPane.PLAIN_MESSAGE);
        } catch (ClienteInexistenteException ex) {
            JOptionPane.showMessageDialog(new JDialog(), "El cliente seleccionado no existe", "Error", JOptionPane.PLAIN_MESSAGE);
        } catch (FavoritoRepetidoException ex) {
            JOptionPane.showMessageDialog(new JDialog(), "No ha marcado ese ítem como favorito", "Error", JOptionPane.PLAIN_MESSAGE);
        } catch (ListaInexistenteException ex) {
            JOptionPane.showMessageDialog(new JDialog(), "La lista no existe", "Error", JOptionPane.PLAIN_MESSAGE);
        } catch (ArtistaInexistenteException ex) {
            JOptionPane.showMessageDialog(new JDialog(), "El artista seleccionado no existe", "Error", JOptionPane.PLAIN_MESSAGE);
        } catch (AlbumInexistenteException ex) {
            JOptionPane.showMessageDialog(new JDialog(), "El album seleccionado no existe", "Error", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnListaDefectoActionPerformed

    private void btnListaPublicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaPublicaActionPerformed
        DataParticular dLista = new DataParticular(String.valueOf(lstpubclicmb.getSelectedItem()),String.valueOf(lstpubcmb.getSelectedItem()),null);
        IDesFavoritear ifav = Fabrica.getIDesFavoritear();
        try {
            ifav.desFavoritear(String.valueOf(clientescmb.getSelectedItem()), dLista);
            JOptionPane.showMessageDialog(this, "Operación completada con éxito.", "OK", JOptionPane.PLAIN_MESSAGE);
        } catch (ClienteInexistenteException ex) {
            JOptionPane.showMessageDialog(new JDialog(), "El cliente seleccionado no existe", "Error", JOptionPane.PLAIN_MESSAGE);
        } catch (FavoritoRepetidoException ex) {
            JOptionPane.showMessageDialog(new JDialog(), "No ha marcado ese ítem como favorito", "Error", JOptionPane.PLAIN_MESSAGE);
        } catch (ListaInexistenteException ex) {
            JOptionPane.showMessageDialog(new JDialog(), "La lista no existe", "Error", JOptionPane.PLAIN_MESSAGE);
        } catch (ArtistaInexistenteException ex) {
            JOptionPane.showMessageDialog(new JDialog(), "El artista seleccionado no existe", "Error", JOptionPane.PLAIN_MESSAGE);
        } catch (AlbumInexistenteException ex) {
            JOptionPane.showMessageDialog(new JDialog(), "El album seleccionado no existe", "Error", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnListaPublicaActionPerformed

    private void btnAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlbumActionPerformed
        DataAlbum dAlbum = new DataAlbum(String.valueOf(albcmb.getSelectedItem()), 0, null, null, String.valueOf(artcmb.getSelectedItem()));
        IDesFavoritear ifav = Fabrica.getIDesFavoritear();
        try {
            ifav.desFavoritear(String.valueOf(clientescmb.getSelectedItem()), dAlbum);
            JOptionPane.showMessageDialog(this, "Operación completada con éxito.", "OK", JOptionPane.PLAIN_MESSAGE);
        } catch (ClienteInexistenteException ex) {
            JOptionPane.showMessageDialog(new JDialog(), "El cliente seleccionado no existe", "Error", JOptionPane.PLAIN_MESSAGE);
        } catch (FavoritoRepetidoException ex) {
            JOptionPane.showMessageDialog(new JDialog(), "No ha marcado ese ítem como favorito", "Error", JOptionPane.PLAIN_MESSAGE);
        } catch (ListaInexistenteException ex) {
            JOptionPane.showMessageDialog(new JDialog(), "La lista no existe", "Error", JOptionPane.PLAIN_MESSAGE);
        } catch (ArtistaInexistenteException ex) {
            JOptionPane.showMessageDialog(new JDialog(), "El artista seleccionado no existe", "Error", JOptionPane.PLAIN_MESSAGE);
        } catch (AlbumInexistenteException ex) {
            JOptionPane.showMessageDialog(new JDialog(), "El album seleccionado no existe", "Error", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnAlbumActionPerformed

    private void btnTemaAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemaAlbumActionPerformed
        DataTema dTema = new DataTema(tematxt.getText(), 0, 0, String.valueOf(artcmb.getSelectedItem()), String.valueOf(albcmb.getSelectedItem()));
        IDesFavoritear ifav = Fabrica.getIDesFavoritear();
        try {
            ifav.desFavoritear(String.valueOf(clientescmb.getSelectedItem()), dTema);
            JOptionPane.showMessageDialog(this, "Operación completada con éxito.", "OK", JOptionPane.PLAIN_MESSAGE);
        } catch (ClienteInexistenteException ex) {
            JOptionPane.showMessageDialog(new JDialog(), "El cliente seleccionado no existe", "Error", JOptionPane.PLAIN_MESSAGE);
        } catch (FavoritoRepetidoException ex) {
            JOptionPane.showMessageDialog(new JDialog(), "No ha marcado ese ítem como favorito", "Error", JOptionPane.PLAIN_MESSAGE);
        } catch (ListaInexistenteException ex) {
            JOptionPane.showMessageDialog(new JDialog(), "La lista no existe", "Error", JOptionPane.PLAIN_MESSAGE);
        } catch (ArtistaInexistenteException ex) {
            JOptionPane.showMessageDialog(new JDialog(), "El artista seleccionado no existe", "Error", JOptionPane.PLAIN_MESSAGE);
        } catch (AlbumInexistenteException ex) {
            JOptionPane.showMessageDialog(new JDialog(), "El album seleccionado no existe", "Error", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnTemaAlbumActionPerformed

    private void lstpubclicmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstpubclicmbActionPerformed
        String nomCliente = String.valueOf(lstpubclicmb.getSelectedItem());
        IDesFavoritear ifav = Fabrica.getIDesFavoritear();
        lstpubcmb.removeAllItems();
        try {
            lstpubcmb.setEnabled(false);
            List<String> listas = ifav.listarListasPublicasDeCliente(nomCliente);
            for(String str : listas) {
                lstpubcmb.addItem(str);
            }
            lstpubcmb.setEnabled(listas.size()>0);
        } catch(ClienteInexistenteException ex) {
            JOptionPane.showMessageDialog(this, "El cliente elegido no existe", "ERROR", JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_lstpubclicmbActionPerformed

    private void albcmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_albcmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_albcmbActionPerformed

    private void artcmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artcmbActionPerformed
        String nomArtista = String.valueOf(artcmb.getSelectedItem());
        IDesFavoritear ifav = Fabrica.getIDesFavoritear();
        albcmb.removeAllItems();
        try {
            albcmb.setEnabled(false);
            List<String> albums = ifav.listarAlbumesDeArtista(nomArtista);
            for (String str : albums) {
                albcmb.addItem(str);
            }
            albcmb.setEnabled(albums.size() > 0);
        } catch (ArtistaInexistenteException e) {
            JOptionPane.showMessageDialog(this, "El artista elegido no existe.", "Atencion!!!", JOptionPane.WARNING_MESSAGE);
        }    }//GEN-LAST:event_artcmbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> albcmb;
    private javax.swing.JComboBox<String> artcmb;
    private javax.swing.JButton btnAlbum;
    private javax.swing.JButton btnListaDefecto;
    private javax.swing.JButton btnListaPublica;
    private javax.swing.JButton btnTemaAlbum;
    private javax.swing.JComboBox<String> clientescmb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> lstdefcmb;
    private javax.swing.JComboBox<String> lstpubclicmb;
    private javax.swing.JComboBox<String> lstpubcmb;
    private javax.swing.JTextField tematxt;
    // End of variables declaration//GEN-END:variables
}
