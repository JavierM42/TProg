package presentacion;

import espotify.Fabrica;
import espotify.datatypes.DataArtistaExt;
import espotify.excepciones.ArtistaInexistenteException;
import espotify.interfaces.IConsultaArtista;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Santiago
 */
public class ConsultaArtista extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaArtista
     */
    public ConsultaArtista() {
        initComponents();
        IConsultaArtista interf = Fabrica.getIConsultaArtista();
        List<String> artistas = interf.listarArtistas();
        for (String str : artistas) {
            Select.addItem(str);
        }
    }

    IConsultaArtista interf = Fabrica.getIConsultaArtista();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Conteiner5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Select = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AlbumsList = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NombreText = new javax.swing.JLabel();
        ApellidoText = new javax.swing.JLabel();
        CorreoText = new javax.swing.JLabel();
        FechaText = new javax.swing.JLabel();
        UrlText = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        SeguidoresList = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        CantidadSeguidoresText = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Consultar Perfil Artista");

        jLabel1.setText("Seleccione un Artista:");

        Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Correo:");

        jLabel5.setText("Fecha Nacimiento:");

        jScrollPane1.setViewportView(AlbumsList);

        jLabel6.setText("Albums:");

        jLabel8.setText("URL:");

        jLabel9.setText("Bio:");

        NombreText.setText("        ");

        ApellidoText.setText("      ");

        CorreoText.setText("      ");

        FechaText.setText("    ");

        UrlText.setText("     ");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jScrollPane3.setViewportView(SeguidoresList);

        jLabel12.setText("Seguidores:");

        javax.swing.GroupLayout Conteiner5Layout = new javax.swing.GroupLayout(Conteiner5);
        Conteiner5.setLayout(Conteiner5Layout);
        Conteiner5Layout.setHorizontalGroup(
            Conteiner5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Conteiner5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Select, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Conteiner5Layout.createSequentialGroup()
                .addGroup(Conteiner5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Conteiner5Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(Conteiner5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Conteiner5Layout.createSequentialGroup()
                                .addGroup(Conteiner5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Conteiner5Layout.createSequentialGroup()
                                        .addGroup(Conteiner5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Conteiner5Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(36, 36, 36))
                                            .addGroup(Conteiner5Layout.createSequentialGroup()
                                                .addGroup(Conteiner5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel3))
                                                .addGap(26, 26, 26)))
                                        .addGroup(Conteiner5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ApellidoText)
                                            .addComponent(NombreText)
                                            .addComponent(CorreoText)))
                                    .addComponent(jLabel1)
                                    .addGroup(Conteiner5Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(FechaText)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Conteiner5Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addGroup(Conteiner5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Conteiner5Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(UrlText)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Conteiner5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Conteiner5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Conteiner5Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(616, 616, 616))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Conteiner5Layout.createSequentialGroup()
                                .addGroup(Conteiner5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(CantidadSeguidoresText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(64, 64, 64))
        );
        Conteiner5Layout.setVerticalGroup(
            Conteiner5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Conteiner5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Conteiner5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Conteiner5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(Conteiner5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreText)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(Conteiner5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ApellidoText)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(Conteiner5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CorreoText)
                            .addComponent(jLabel4))
                        .addGap(14, 14, 14)
                        .addGroup(Conteiner5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FechaText)
                            .addComponent(jLabel5)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Conteiner5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(Conteiner5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(UrlText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(Conteiner5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Conteiner5Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(Conteiner5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Conteiner5Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(27, 27, 27)
                                .addComponent(CantidadSeguidoresText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Conteiner5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Conteiner5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectActionPerformed
        // TODO add your handling code here:
        String usr = String.valueOf(Select.getSelectedItem());
        DataArtistaExt dArt;
        try {
            dArt = interf.consultaArtista(usr);
        } catch (ArtistaInexistenteException ex) {
            return;
        }
        NombreText.setText(dArt.getNombre());
        ApellidoText.setText(dArt.getApellido());
        CorreoText.setText(dArt.getCorreo());
        jTextArea1.setText(dArt.getBio());
        UrlText.setText(dArt.getUrl());
        List<String> seguidores = dArt.getSeguidores();
        int cantSeguidores = seguidores.size();
        String[] array = new String[cantSeguidores];
        int idx = 0;
        for (String seguidor : seguidores) {
            array[idx] = seguidor;
            idx++;
        }
        SeguidoresList.setListData(array);
        CantidadSeguidoresText.setText("Total: " + cantSeguidores);
        Calendar fechaNacimiento = dArt.getfNac();
        String fecha = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if (fechaNacimiento != null) {
            fecha = sdf.format(fechaNacimiento.getTime());
        }
        FechaText.setText(fecha);
        String[] albums = dArt.getAlbums();
        AlbumsList.clearSelection();
        AlbumsList.setListData(albums);
        BufferedImage imagen = dArt.getImg();
        BufferedImage image;
        if (imagen != null) {
            image = getScaledImage(imagen,200,200);
        } else {
            image = imagen;
        }
        jLabel7.removeAll();
        jLabel7.repaint();
        if (image != null) {
            ImageIcon img = new ImageIcon(image);
            jLabel7.setIcon(img);
            jLabel7.setVisible(true);
        } else {
            //jLabel7.setText("El usuario NO tiene imagen");
            jLabel7.setVisible(false);
        }   
    }//GEN-LAST:event_SelectActionPerformed


    private BufferedImage getScaledImage(BufferedImage src, int width, int height) {
        int finalw = width;
        int finalh = height;
        double factor = 1.0d;
        if (src.getWidth() > src.getHeight()) {
            factor = (double)src.getHeight() / (double)src.getWidth();
            finalh = (int)(finalw * factor);                
        } else {
            factor = (double)src.getWidth() / (double)src.getHeight();
            finalw = (int)(finalh * factor);
        }   

        BufferedImage resizedImg = new BufferedImage(finalw, finalh, BufferedImage.TRANSLUCENT);
        Graphics2D grafico2 = resizedImg.createGraphics();
        grafico2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        grafico2.drawImage(src, 0, 0, finalw, finalh, null);
        grafico2.dispose();
        return resizedImg;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> AlbumsList;
    private javax.swing.JLabel ApellidoText;
    private javax.swing.JLabel CantidadSeguidoresText;
    private javax.swing.JPanel Conteiner5;
    private javax.swing.JLabel CorreoText;
    private javax.swing.JLabel FechaText;
    private javax.swing.JLabel NombreText;
    private javax.swing.JList<String> SeguidoresList;
    private javax.swing.JComboBox<String> Select;
    private javax.swing.JLabel UrlText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
