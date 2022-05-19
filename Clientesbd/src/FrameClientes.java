
import datos.EstudianteDao;
import datos.EstudianteNotasDao;
import domain.Estudiante;
import domain.EstudianteNotas;
import domain.Global;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FrameClientes extends javax.swing.JFrame {

    public static registrarNotas formRegistraNotas;
    public static ModificarNotas formmodnotas;
    public static EliminarNotas formeliminarnotas;

    /**
     * Creates new form FrameClientes
     */
    public FrameClientes() {
        initComponents();

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("correo");
        model.addColumn("Programación III");
        model.addColumn("Calculo Integral");
        model.addColumn("Catedra Institucional");
        model.addColumn("Teoría de Sistemas");
        model.addColumn("Nota Final");
        model.addColumn("Descripcion");

        List<Double> notasest1 = new ArrayList<>();
        List<Double> notasest2 = new ArrayList<>();
        List<Double> notasest3 = new ArrayList<>();
        List<Double> notasest4 = new ArrayList<>();

        EstudianteDao estu = new EstudianteDao();
        EstudianteNotasDao estunotas = new EstudianteNotasDao();

        List<EstudianteNotas> notasfinales = estunotas.seleccionar();

        List<Estudiante> estudiantes = estu.seleccionar();

        for (int j = 0; j < notasfinales.size(); j++) {

            if (notasfinales.get(j).getIdest() == 1 && notasfinales.get(j).getIdmat() == 1) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest1.add(notafinal);
            }

            if (notasfinales.get(j).getIdest() == 1 && notasfinales.get(j).getIdmat() == 2) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest2.add(notafinal);
            }

            if (notasfinales.get(j).getIdest() == 1 && notasfinales.get(j).getIdmat() == 3) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest3.add(notafinal);
            }

            if (notasfinales.get(j).getIdest() == 1 && notasfinales.get(j).getIdmat() == 4) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest4.add(notafinal);
            }

            if (notasfinales.get(j).getIdest() == 2 && notasfinales.get(j).getIdmat() == 1) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest1.add(notafinal);
            }

            if (notasfinales.get(j).getIdest() == 2 && notasfinales.get(j).getIdmat() == 2) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest2.add(notafinal);
            }

            if (notasfinales.get(j).getIdest() == 2 && notasfinales.get(j).getIdmat() == 3) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest3.add(notafinal);
            }

            if (notasfinales.get(j).getIdest() == 2 && notasfinales.get(j).getIdmat() == 4) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest4.add(notafinal);
            }

            if (notasfinales.get(j).getIdest() == 3 && notasfinales.get(j).getIdmat() == 1) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest1.add(notafinal);
            }

            if (notasfinales.get(j).getIdest() == 3 && notasfinales.get(j).getIdmat() == 2) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest2.add(notafinal);
            }

            if (notasfinales.get(j).getIdest() == 3 && notasfinales.get(j).getIdmat() == 3) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest3.add(notafinal);
            }

            if (notasfinales.get(j).getIdest() == 3 && notasfinales.get(j).getIdmat() == 4) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest4.add(notafinal);
            }

        }

        while (notasest1.size() < 3) {
            notasest1.add(0.0);
        }
        while (notasest2.size() < 3) {
            notasest2.add(0.0);
        }
        while (notasest3.size() < 3) {
            notasest3.add(0.0);
        }
        while (notasest4.size() < 3) {
            notasest4.add(0.0);
        }

        double not1 = 0;
        double not2 = 0;
        double not3 = 0;

        not1 = (not1 + notasest1.get(0) + notasest2.get(0) + notasest3.get(0) + notasest4.get(0))/4;
        not2 = (not2 + notasest1.get(1) + notasest2.get(1) + notasest3.get(1) + notasest4.get(1))/4;
        not3 = (not3 + notasest1.get(2) + notasest2.get(2) + notasest3.get(2) + notasest4.get(2))/4;
        
        List<Double> notasestfinal = new ArrayList<>();
        List<String> des = new ArrayList<>();
        
        notasestfinal.add(not1);
        notasestfinal.add(not2);
        notasestfinal.add(not3);
        
        if(not1 < 3){
            des.add("perdio");
        }else{
            des.add("paso");
        }
        
        if(not2 < 3){
            des.add("perdio");
        }else{
            des.add("paso");
        }
        
        if(not3 < 3){
            des.add("perdio");
        }else{
            des.add("paso");
        }
        

        for (int i = 0; i < estudiantes.size(); i++) {

            model.addRow(new Object[]{estudiantes.get(i).getId(), estudiantes.get(i).getNombre(), estudiantes.get(i).getApellido(),
                estudiantes.get(i).getCorreo(), notasest1.get(i), notasest2.get(i), notasest3.get(i), notasest4.get(i),notasestfinal.get(i),des.get(i)});

        }

        jTable1.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnRegistrarnotas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtestid = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Universidad");
        jLabel1.setToolTipText("");

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setText("Actualizar Datos");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        btnRegistrarnotas.setText("Registrar notas");
        btnRegistrarnotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarnotasActionPerformed(evt);
            }
        });

        jLabel3.setText("Digite el codigo del estudiante");

        jButton2.setText("Modificar Notas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarnotas, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(380, 380, 380))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(txtestid, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtestid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarnotas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(249, 249, 249))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("correo");
        model.addColumn("Programación III");
        model.addColumn("Calculo Integral");
        model.addColumn("Catedra Institucional");
        model.addColumn("Teoría de Sistemas");
        model.addColumn("Nota Final");
        model.addColumn("Descripcion");

        List<Double> notasest1 = new ArrayList<>();
        List<Double> notasest2 = new ArrayList<>();
        List<Double> notasest3 = new ArrayList<>();
        List<Double> notasest4 = new ArrayList<>();

        EstudianteDao estu = new EstudianteDao();
        EstudianteNotasDao estunotas = new EstudianteNotasDao();

        List<EstudianteNotas> notasfinales = estunotas.seleccionar();

        List<Estudiante> estudiantes = estu.seleccionar();

        for (int j = 0; j < notasfinales.size(); j++) {

            if (notasfinales.get(j).getIdest() == 1 && notasfinales.get(j).getIdmat() == 1) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest1.add(notafinal);
            }

            if (notasfinales.get(j).getIdest() == 1 && notasfinales.get(j).getIdmat() == 2) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest2.add(notafinal);
            }

            if (notasfinales.get(j).getIdest() == 1 && notasfinales.get(j).getIdmat() == 3) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest3.add(notafinal);
            }

            if (notasfinales.get(j).getIdest() == 1 && notasfinales.get(j).getIdmat() == 4) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest4.add(notafinal);
            }

            if (notasfinales.get(j).getIdest() == 2 && notasfinales.get(j).getIdmat() == 1) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest1.add(notafinal);
            }

            if (notasfinales.get(j).getIdest() == 2 && notasfinales.get(j).getIdmat() == 2) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest2.add(notafinal);
            }

            if (notasfinales.get(j).getIdest() == 2 && notasfinales.get(j).getIdmat() == 3) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest3.add(notafinal);
            }

            if (notasfinales.get(j).getIdest() == 2 && notasfinales.get(j).getIdmat() == 4) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest4.add(notafinal);
            }

            if (notasfinales.get(j).getIdest() == 3 && notasfinales.get(j).getIdmat() == 1) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest1.add(notafinal);
            }

            if (notasfinales.get(j).getIdest() == 3 && notasfinales.get(j).getIdmat() == 2) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest2.add(notafinal);
            }

            if (notasfinales.get(j).getIdest() == 3 && notasfinales.get(j).getIdmat() == 3) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest3.add(notafinal);
            }

            if (notasfinales.get(j).getIdest() == 3 && notasfinales.get(j).getIdmat() == 4) {
                double nota1 = notasfinales.get(j).getNota1();
                double nota2 = notasfinales.get(j).getNota2();
                double nota3 = notasfinales.get(j).getNota3();

                double notafinal = (nota1 + nota2 + nota3) / 3;

                notasest4.add(notafinal);
            }

        }

        while (notasest1.size() < 3) {
            notasest1.add(0.0);
        }
        while (notasest2.size() < 3) {
            notasest2.add(0.0);
        }
        while (notasest3.size() < 3) {
            notasest3.add(0.0);
        }
        while (notasest4.size() < 3) {
            notasest4.add(0.0);
        }

        double not1 = 0;
        double not2 = 0;
        double not3 = 0;

        not1 = (not1 + notasest1.get(0) + notasest2.get(0) + notasest3.get(0) + notasest4.get(0))/4;
        not2 = (not2 + notasest1.get(1) + notasest2.get(1) + notasest3.get(1) + notasest4.get(1))/4;
        not3 = (not3 + notasest1.get(2) + notasest2.get(2) + notasest3.get(2) + notasest4.get(2))/4;
        
        List<Double> notasestfinal = new ArrayList<>();
        List<String> des = new ArrayList<>();
        
        notasestfinal.add(not1);
        notasestfinal.add(not2);
        notasestfinal.add(not3);
        
        if(not1 < 3){
            des.add("perdio");
        }else{
            des.add("paso");
        }
        
        if(not2 < 3){
            des.add("perdio");
        }else{
            des.add("paso");
        }
        
        if(not3 < 3){
            des.add("perdio");
        }else{
            des.add("paso");
        }
        

        for (int i = 0; i < estudiantes.size(); i++) {

            model.addRow(new Object[]{estudiantes.get(i).getId(), estudiantes.get(i).getNombre(), estudiantes.get(i).getApellido(),
                estudiantes.get(i).getCorreo(), notasest1.get(i), notasest2.get(i), notasest3.get(i), notasest4.get(i),notasestfinal.get(i),des.get(i)});

        }

        jTable1.setModel(model);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegistrarnotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarnotasActionPerformed

        EstudianteDao estu = new EstudianteDao();

        List<Estudiante> estudiantes = estu.seleccionar();

        int cod = Integer.parseInt(txtestid.getText());
        boolean bandera = true;

        for (int i = 0; i < estudiantes.size(); i++) {

            if (estudiantes.get(i).getId() == cod) {
                bandera = false;
                Global.cod = cod;
            }

        }

        if (bandera) {
            JOptionPane.showMessageDialog(null, "Debe Escribir un codigo que este dentro de los estudiantes ya existentes");

        } else {

            formRegistraNotas = new registrarNotas();
            formRegistraNotas.setVisible(true);
        }


    }//GEN-LAST:event_btnRegistrarnotasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EstudianteDao estu = new EstudianteDao();

        List<Estudiante> estudiantes = estu.seleccionar();

        int cod = Integer.parseInt(txtestid.getText());
        boolean bandera = true;

        for (int i = 0; i < estudiantes.size(); i++) {

            if (estudiantes.get(i).getId() == cod) {
                bandera = false;
                Global.cod = cod;
            }

        }

        if (bandera) {
            JOptionPane.showMessageDialog(null, "Debe Escribir un codigo que este dentro de los estudiantes ya existentes");

        } else {

            formmodnotas = new ModificarNotas();
            formmodnotas.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int fila = jTable1.getSelectedRow();
        txtestid.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        EstudianteDao estu = new EstudianteDao();

        List<Estudiante> estudiantes = estu.seleccionar();

        int cod = Integer.parseInt(txtestid.getText());
        boolean bandera = true;

        for (int i = 0; i < estudiantes.size(); i++) {

            if (estudiantes.get(i).getId() == cod) {
                bandera = false;
                Global.cod = cod;
            }

        }

        if (bandera) {
            JOptionPane.showMessageDialog(null, "Debe Escribir un codigo que este dentro de los estudiantes ya existentes");

        } else {

            formeliminarnotas = new EliminarNotas();
            formeliminarnotas.setVisible(true);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarnotas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtestid;
    // End of variables declaration//GEN-END:variables
}
