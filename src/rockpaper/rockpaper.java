/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rockpaper;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;

public class rockpaper extends javax.swing.JFrame {
    int introtime = 0 ;
    int mouseX ,mouseY;
    public rockpaper() {
        initComponents();
        intro.setVisible(true);
        setlevel.setVisible(false);
        
        game.setVisible(false);
        gifpanel.setVisible(false);
        Timer time = new Timer(1000,null);
        time.start();
        time.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                introtime++;
                if(introtime == 5)
                {
                    intro.setVisible(false);
                    setlevel.setVisible(true);
                   
                   game.setVisible(false);
                   gifpanel.setVisible(false);
                }
            }
        });
        close1.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e)
                {
                    System.exit(0);
                }
        public void mouseEntered(MouseEvent e)
                {
                    close1.setOpaque(true);
                    close1.setBackground(Color.red);
                    close1.setForeground(new Color(204,204,204));
                }
        public void mouseExited(MouseEvent e)
                {
                    close1.setOpaque(false);
                    close1.setForeground(Color.red);
                }
    });
        close2.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e)
                {
                    System.exit(0);
                }
        public void mouseEntered(MouseEvent e)
                {
                    close2.setOpaque(true);
                    close2.setBackground(Color.red);
                    close2.setForeground(new Color(204,204,204));
                }
        public void mouseExited(MouseEvent e)
                {
                    close2.setOpaque(false);
                    close2.setForeground(Color.black);
                }
    });
        
        mini1.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e)
                {
                    setState(JFrame.ICONIFIED);
                }
        public void mouseEntered(MouseEvent e)
                {
                    mini1.setOpaque(true);
                    mini1.setBackground(Color.gray);
                    mini1.setIcon(new ImageIcon(getClass().getResource("/img/minib.png")));
                }
        public void mouseExited(MouseEvent e)
                {
                    mini1.setOpaque(false);
                    mini1.setIcon(new ImageIcon(getClass().getResource("/img/miniw.png")));
                }
    });
        
        mini2.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e)
                {
                    setState(JFrame.ICONIFIED);
                }
        public void mouseEntered(MouseEvent e)
                {
                    mini2.setOpaque(true);
                    mini2.setBackground(Color.white);
                    mini2.setIcon(new ImageIcon(getClass().getResource("/img/minib.png")));
                }
        public void mouseExited(MouseEvent e)
                {
                    mini2.setOpaque(false);
                    mini2.setIcon(new ImageIcon(getClass().getResource("/img/miniw.png")));
                }
    });
        
        getContentPane().addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
            }
        });

        getContentPane().addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen();
                int y = e.getYOnScreen();
                setLocation(x - mouseX, y - mouseY);
            }
        });

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        gifpanel = new javax.swing.JPanel();
        giflabel = new javax.swing.JLabel();
        setlevel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        r3 = new javax.swing.JButton();
        r5 = new javax.swing.JButton();
        r7 = new javax.swing.JButton();
        r11 = new javax.swing.JButton();
        start = new javax.swing.JButton();
        close1 = new javax.swing.JLabel();
        mini1 = new javax.swing.JLabel();
        game = new javax.swing.JPanel();
        you = new javax.swing.JLabel();
        comp = new javax.swing.JLabel();
        rock = new javax.swing.JButton();
        paper = new javax.swing.JButton();
        scissor = new javax.swing.JButton();
        resu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        close2 = new javax.swing.JLabel();
        mini2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        intro = new javax.swing.JPanel();
        startbg = new javax.swing.JLabel();

        jDialog1.setUndecorated(true);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(794, 490));

        gifpanel.setBackground(new java.awt.Color(255, 255, 255));
        gifpanel.setPreferredSize(new java.awt.Dimension(487, 487));

        giflabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout gifpanelLayout = new javax.swing.GroupLayout(gifpanel);
        gifpanel.setLayout(gifpanelLayout);
        gifpanelLayout.setHorizontalGroup(
            gifpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(giflabel, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        gifpanelLayout.setVerticalGroup(
            gifpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(giflabel, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        setlevel.setOpaque(false);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Select The Number Of Rounds");

        r3.setBackground(new java.awt.Color(102, 204, 255));
        r3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        r3.setForeground(new java.awt.Color(0, 0, 0));
        r3.setText("3");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        r5.setBackground(new java.awt.Color(102, 204, 255));
        r5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        r5.setForeground(new java.awt.Color(0, 0, 0));
        r5.setText("5");
        r5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5ActionPerformed(evt);
            }
        });

        r7.setBackground(new java.awt.Color(102, 204, 255));
        r7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        r7.setForeground(new java.awt.Color(0, 0, 0));
        r7.setText("7");
        r7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7ActionPerformed(evt);
            }
        });

        r11.setBackground(new java.awt.Color(102, 204, 255));
        r11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        r11.setForeground(new java.awt.Color(0, 0, 0));
        r11.setText("11");
        r11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r11ActionPerformed(evt);
            }
        });

        start.setBackground(new java.awt.Color(102, 204, 255));
        start.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        start.setForeground(new java.awt.Color(0, 0, 0));
        start.setText("START");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        close1.setBackground(new java.awt.Color(204, 204, 204));
        close1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        close1.setForeground(new java.awt.Color(255, 0, 51));
        close1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/closer.png"))); // NOI18N
        close1.setPreferredSize(new java.awt.Dimension(11, 20));

        mini1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mini1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/miniw.png"))); // NOI18N

        javax.swing.GroupLayout setlevelLayout = new javax.swing.GroupLayout(setlevel);
        setlevel.setLayout(setlevelLayout);
        setlevelLayout.setHorizontalGroup(
            setlevelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setlevelLayout.createSequentialGroup()
                .addGroup(setlevelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setlevelLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addGroup(setlevelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setlevelLayout.createSequentialGroup()
                                .addComponent(r5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addComponent(r7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67)
                        .addComponent(r11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(setlevelLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setlevelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mini1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(setlevelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setlevelLayout.createSequentialGroup()
                    .addGap(0, 771, Short.MAX_VALUE)
                    .addComponent(close1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        setlevelLayout.setVerticalGroup(
            setlevelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setlevelLayout.createSequentialGroup()
                .addComponent(mini1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(setlevelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(r3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(r5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(81, 81, 81)
                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(setlevelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(setlevelLayout.createSequentialGroup()
                    .addComponent(close1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 414, Short.MAX_VALUE)))
        );

        game.setBackground(new java.awt.Color(255, 255, 255));
        game.setOpaque(false);

        you.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rockyou.png"))); // NOI18N

        comp.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        comp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rockcomp.png"))); // NOI18N

        rock.setBackground(new java.awt.Color(153, 204, 255));
        rock.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rock.setForeground(new java.awt.Color(0, 0, 0));
        rock.setText("Rock");
        rock.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rockActionPerformed(evt);
            }
        });

        paper.setBackground(new java.awt.Color(153, 204, 255));
        paper.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        paper.setForeground(new java.awt.Color(0, 0, 0));
        paper.setText("Paper");
        paper.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paperActionPerformed(evt);
            }
        });

        scissor.setBackground(new java.awt.Color(153, 204, 255));
        scissor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        scissor.setForeground(new java.awt.Color(0, 0, 0));
        scissor.setText("Scossors");
        scissor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        scissor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scissorActionPerformed(evt);
            }
        });

        resu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GIF/lets.gif"))); // NOI18N

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("YOU");

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Computer");

        close2.setBackground(new java.awt.Color(255, 255, 255));
        close2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        close2.setForeground(new java.awt.Color(0, 0, 0));
        close2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/closew.png"))); // NOI18N
        close2.setPreferredSize(new java.awt.Dimension(11, 20));

        mini2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mini2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/miniw.png"))); // NOI18N

        javax.swing.GroupLayout gameLayout = new javax.swing.GroupLayout(game);
        game.setLayout(gameLayout);
        gameLayout.setHorizontalGroup(
            gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, gameLayout.createSequentialGroup()
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rock, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(you, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resu)
                    .addGroup(gameLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(paper, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gameLayout.createSequentialGroup()
                        .addComponent(scissor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(comp, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, gameLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(47, 47, 47))
            .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameLayout.createSequentialGroup()
                    .addGap(0, 771, Short.MAX_VALUE)
                    .addComponent(close2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gameLayout.createSequentialGroup()
                    .addGap(749, 749, 749)
                    .addComponent(mini2)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );
        gameLayout.setVerticalGroup(
            gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(you, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(58, 58, 58)
                .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rock)
                    .addComponent(paper)
                    .addComponent(scissor))
                .addContainerGap(170, Short.MAX_VALUE))
            .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gameLayout.createSequentialGroup()
                    .addComponent(close2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 487, Short.MAX_VALUE)))
            .addGroup(gameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gameLayout.createSequentialGroup()
                    .addComponent(mini2)
                    .addGap(0, 487, Short.MAX_VALUE)))
        );

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg4.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(game, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(setlevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(gifpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(background)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(game, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setlevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gifpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(background)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        intro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startbg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        startbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GIF/intro.gif"))); // NOI18N
        intro.add(startbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(intro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(intro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleName("window");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
    }//GEN-LAST:event_formWindowActivated

    Random rand;
    int choise = 0;
    int rounds = 0;
    int count = 0;
    int timecount = 0;
    int yourscore = 0, compscore = 0;
    String yourchoise = "",compchoise="";
    private void scissorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scissorActionPerformed
        count++;
        rand = new Random();
        choise = rand.nextInt(3);
        you.setIcon(new ImageIcon(getClass().getResource("/img/scissorsyou.png")));
        yourchoise = "s";
        if(choise == 0)
       {
           compchoise = "r";
           comp.setIcon(new ImageIcon(getClass().getResource("/img/rockcomp.png")));
       }
       else if(choise == 1)
       {
           compchoise = "p";
           comp.setIcon(new ImageIcon(getClass().getResource("/img/papercomp.png")));
       }
       else if(choise == 2)
       {
           compchoise = "s";
           comp.setIcon(new ImageIcon(getClass().getResource("/img/scissorscomp.png")));
       }
        
        if(yourchoise.equals("r") && compchoise.equals("s") || yourchoise.equals("p") && compchoise.equals("r") || yourchoise.equals("s") && compchoise.equals("p")  )
        {
            resu.setIcon(new ImageIcon(getClass().getResource("/img/wiin.png")));
            yourscore++;
        }
        if(yourchoise.equals("r") && compchoise.equals("p") || yourchoise.equals("p") && compchoise.equals("s") || yourchoise.equals("s") && compchoise.equals("r")  )
        {
            resu.setIcon(new ImageIcon(getClass().getResource("/img/loose.png")));
            compscore++;
        }
        if(yourchoise.equals(compchoise))
        {
            resu.setIcon(new ImageIcon(getClass().getResource("/img/drraw.png")));
            yourscore++;
            compscore++;
        }
       
       if(count == rounds)
        {
            rock.setEnabled(false);
            paper.setEnabled(false);
            scissor.setEnabled(false);
            Timer time = new Timer(1000,null);
            time.start();
            time.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    timecount++;
                    if(yourscore<compscore)
                    {
                        giflabel.setIcon(new ImageIcon(getClass().getResource("/GIF/lose.gif")));
                    }
                     if(yourscore>compscore)
                     {
                         giflabel.setIcon(new ImageIcon(getClass().getResource("/GIF/win.gif")));
                     }
                      if(yourscore == compscore)
                     {
                         giflabel.setIcon(new ImageIcon(getClass().getResource("/GIF/draw.gif")));
                     }
                     
                     gifpanel.setVisible(true);
                     if(timecount == 6)
                     {
                        gifpanel.setVisible(false);
                         timecount = 0;
                         choise = 0;
                         rounds = 0;
                         count = 1;
                         background.setIcon(new ImageIcon(getClass().getResource("/img/bg4.jpg")));
                         setlevel.setVisible(true);
                        
                        game.setVisible(false);
                         time.stop();
                     }
                }
            });
        }
    }//GEN-LAST:event_scissorActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
         setlevel.setVisible(false);
         
         game.setVisible(true);
         r3.setBackground(new Color(102,204,255));
         r5.setBackground(new Color(102,204,255));
         r7.setBackground(new Color(102,204,255));
         r11.setBackground(new Color(102,204,255));
         rock.setEnabled(true);
         paper.setEnabled(true);
         scissor.setEnabled(true);
        choise = 0;
        resu.setIcon(new ImageIcon(getClass().getResource("/GIF/lets.gif")));
         count = 0;
        timecount = 0;
        yourscore = 0; compscore = 0;
        yourchoise = "";compchoise="";
         background.setIcon(new ImageIcon(getClass().getResource("/img/bg.jpg")));
    }//GEN-LAST:event_startActionPerformed

    private void rockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rockActionPerformed
        count++;
        rand = new Random();
        choise = rand.nextInt(3);
        you.setIcon(new ImageIcon(getClass().getResource("/img/rockyou.png")));
        yourchoise = "r";
        if(choise == 0)
       {
           compchoise = "r";
           comp.setIcon(new ImageIcon(getClass().getResource("/img/rockcomp.png")));
       }
       else if(choise == 1)
       {
           compchoise = "p";
           comp.setIcon(new ImageIcon(getClass().getResource("/img/papercomp.png")));
       }
       else if(choise == 2)
       {
           compchoise = "s";
           comp.setIcon(new ImageIcon(getClass().getResource("/img/scissorscomp.png")));
       }
        
        if(yourchoise.equals("r") && compchoise.equals("s") || yourchoise.equals("p") && compchoise.equals("r") || yourchoise.equals("s") && compchoise.equals("p")  )
        {
            resu.setIcon(new ImageIcon(getClass().getResource("/img/wiin.png")));
            yourscore++;
        }
        if(yourchoise.equals("r") && compchoise.equals("p") || yourchoise.equals("p") && compchoise.equals("s") || yourchoise.equals("s") && compchoise.equals("r")  )
        {
            resu.setIcon(new ImageIcon(getClass().getResource("/img/loose.png")));
            compscore++;
        }
        if(yourchoise.equals(compchoise))
        {
            resu.setIcon(new ImageIcon(getClass().getResource("/img/drraw.png")));
            compscore++;
            yourscore++;
        }
       
        if(count == rounds)
        {
            rock.setEnabled(false);
            paper.setEnabled(false);
            scissor.setEnabled(false);
            Timer time = new Timer(1000,null);
            time.start();
            time.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    timecount++;
                    if(yourscore < compscore)
                    {
                        giflabel.setIcon(new ImageIcon(getClass().getResource("/GIF/lose.gif")));
                    }
                     if(yourscore > compscore)
                     {
                         giflabel.setIcon(new ImageIcon(getClass().getResource("/GIF/win.gif")));
                     }
                     if(yourscore == compscore)
                     {
                         giflabel.setIcon(new ImageIcon(getClass().getResource("/GIF/draw.gif")));
                     }
                     
                     gifpanel.setVisible(true);
                     if(timecount == 6)
                     {
                         gifpanel.setVisible(false);
                         timecount = 0;
                         choise = 0;
                         rounds = 0;
                         count = 0;
                         background.setIcon(new ImageIcon(getClass().getResource("/img/bg4.jpg")));
                         setlevel.setVisible(true);
                        
                        game.setVisible(false);
                         time.stop();
                     }
                }
            });
        }
    }//GEN-LAST:event_rockActionPerformed

    private void paperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paperActionPerformed
       count++;
        rand = new Random();
        choise = rand.nextInt(3);
        you.setIcon(new ImageIcon(getClass().getResource("/img/paperyou.png")));
        yourchoise = "p";
        if(choise == 0)
       {
           compchoise = "r";
           comp.setIcon(new ImageIcon(getClass().getResource("/img/rockcomp.png")));
       }
       else if(choise == 1)
       {
           compchoise = "p";
           comp.setIcon(new ImageIcon(getClass().getResource("/img/papercomp.png")));
       }
       else if(choise == 2)
       {
           compchoise = "s";
           comp.setIcon(new ImageIcon(getClass().getResource("/img/scissorscomp.png")));
       }
        if(yourchoise.equals("r") && compchoise.equals("s") || yourchoise.equals("p") && compchoise.equals("r") || yourchoise.equals("s") && compchoise.equals("p")  )
        {
            resu.setIcon(new ImageIcon(getClass().getResource("/img/wiin.png")));
            yourscore++;
        }
        if(yourchoise.equals("r") && compchoise.equals("p") || yourchoise.equals("p") && compchoise.equals("s") || yourchoise.equals("s") && compchoise.equals("r")  )
        {
            resu.setIcon(new ImageIcon(getClass().getResource("/img/loose.png")));
            compscore++;
        }
       
        if(yourchoise.equals(compchoise))
        {
            resu.setIcon(new ImageIcon(getClass().getResource("/img/drraw.png")));
            yourscore++;
            compscore++;
        }
        
        if(count == rounds)
        {
            rock.setEnabled(false);
            paper.setEnabled(false);
            scissor.setEnabled(false);
            Timer time = new Timer(1000,null);
            time.start();
            time.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    timecount++;
                    if(yourscore < compscore)
                    {
                        giflabel.setIcon(new ImageIcon(getClass().getResource("/GIF/lose.gif")));
                    }
                     if(yourscore > compscore)
                     {
                         giflabel.setIcon(new ImageIcon(getClass().getResource("/GIF/win.gif")));
                     }
                      if(yourscore == compscore)
                     {
                         giflabel.setIcon(new ImageIcon(getClass().getResource("/GIF/draw.gif")));
                     }
                    
                     gifpanel.setVisible(true);
                     if(timecount == 6)
                     {
                         gifpanel.setVisible(false);
                         timecount = 0;
                         choise = 0;
                         rounds = 0;
                         count = 0;
                         background.setIcon(new ImageIcon(getClass().getResource("/img/bg4.jpg")));
                         setlevel.setVisible(true);
                        
                        game.setVisible(false);
                         time.stop();
                     }
                }
            });
        }
    }//GEN-LAST:event_paperActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        rounds = 3;
        r3.setBackground(Color.green);
        
         r5.setBackground(new Color(102,204,255));
         r7.setBackground(new Color(102,204,255));
         r11.setBackground(new Color(102,204,255));
    }//GEN-LAST:event_r3ActionPerformed

    private void r5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5ActionPerformed
        rounds = 5;
        r5.setBackground(Color.green);
        r3.setBackground(new Color(102,204,255));
        
         r7.setBackground(new Color(102,204,255));
         r11.setBackground(new Color(102,204,255));
    }//GEN-LAST:event_r5ActionPerformed

    private void r7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7ActionPerformed
       rounds  = 7;
       r7.setBackground(Color.green);
       r3.setBackground(new Color(102,204,255));
         r5.setBackground(new Color(102,204,255));
         
         r11.setBackground(new Color(102,204,255));
    }//GEN-LAST:event_r7ActionPerformed

    private void r11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r11ActionPerformed
        rounds = 11;
        r11.setBackground(Color.green);
        r3.setBackground(new Color(102,204,255));
         r5.setBackground(new Color(102,204,255));
         r7.setBackground(new Color(102,204,255));
         
    }//GEN-LAST:event_r11ActionPerformed

    
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rockpaper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel close1;
    private javax.swing.JLabel close2;
    private javax.swing.JLabel comp;
    private javax.swing.JPanel game;
    private javax.swing.JLabel giflabel;
    private javax.swing.JPanel gifpanel;
    private javax.swing.JPanel intro;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mini1;
    private javax.swing.JLabel mini2;
    private javax.swing.JButton paper;
    private javax.swing.JButton r11;
    private javax.swing.JButton r3;
    private javax.swing.JButton r5;
    private javax.swing.JButton r7;
    private javax.swing.JLabel resu;
    private javax.swing.JButton rock;
    private javax.swing.JButton scissor;
    private javax.swing.JPanel setlevel;
    private javax.swing.JButton start;
    private javax.swing.JLabel startbg;
    private javax.swing.JLabel you;
    // End of variables declaration//GEN-END:variables
}
