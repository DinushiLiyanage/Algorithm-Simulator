//DAA Assignement - 2nd Year 2nd Semester
//IT15018960
//D.U.Liyanage
//Weekend - Group 2 

public class Algorithms extends javax.swing.JFrame 
{
    public Algorithms() 
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAlgorithms = new javax.swing.JPanel();
        algorithmTabbedPane = new javax.swing.JTabbedPane();
        InsertionSort = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        SelectionSort = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(602, 497));
        setMinimumSize(new java.awt.Dimension(602, 497));

        panelAlgorithms.setBackground(new java.awt.Color(255, 255, 255));

        algorithmTabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        algorithmTabbedPane.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        algorithmTabbedPane.setMaximumSize(new java.awt.Dimension(602, 497));
        algorithmTabbedPane.setMinimumSize(new java.awt.Dimension(602, 497));
        algorithmTabbedPane.setPreferredSize(new java.awt.Dimension(602, 497));

        InsertionSort.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("void insertionSort(int[] arr) \n{\n        int k,key,l ;\n        int arr[5];\n\n        for(k=1;k<5;k++)\n        {\n              key = arr[k];\n              l = k-1;\n\t\n              while((l>=0)&&(arr[l]>key))\n              {\n\tarr[l+1]=arr[l];\n\t l=l-1;\n              }\t\n\t\t\n              arr[l+1]=key;\n\t\t\n         }\n");
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("Properties\n\n*  Good for smaller arrays.\n\nBest , Average,Worst Cases\n\n*  Best Case          :    O(n)\n*  Average Case    :    O(n^2)\n*  Worst Case       :    O(n^2)");
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout InsertionSortLayout = new javax.swing.GroupLayout(InsertionSort);
        InsertionSort.setLayout(InsertionSortLayout);
        InsertionSortLayout.setHorizontalGroup(
            InsertionSortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InsertionSortLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        InsertionSortLayout.setVerticalGroup(
            InsertionSortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InsertionSortLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InsertionSortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        algorithmTabbedPane.addTab("Insertion Sort", InsertionSort);

        SelectionSort.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("public void selectionSort(int[] arr,int size)\n{\n      int minIndex, tmp;      \n\n      for (int step = 0; step < size - 1; step++) \n      {\n            minIndex = step;\n\n            for (int j = step + 1; j < size; j++)\n            {      \n                 if (arr[j] < arr[minIndex])\n                 minIndex = j;\n            }\n                 tmp = arr[step];\n                 arr[step] = arr[minIndex];\n                 arr[minIndex] = tmp;\n            }\n      }\n}");
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("Properties\n\n*  It is a  Stable algorithm and does not\n    change the relative order of elements \n    with equal keys.\n\nBest , Average,Worst Cases\n\n*  Best Case         :    O(n^2)\n*  Average Case   :    O(n^2)\n*  Worst Case      :    O(n^2)");
        jScrollPane4.setViewportView(jTextArea4);

        javax.swing.GroupLayout SelectionSortLayout = new javax.swing.GroupLayout(SelectionSort);
        SelectionSort.setLayout(SelectionSortLayout);
        SelectionSortLayout.setHorizontalGroup(
            SelectionSortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectionSortLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        SelectionSortLayout.setVerticalGroup(
            SelectionSortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectionSortLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SelectionSortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        algorithmTabbedPane.addTab("Selection Sort", SelectionSort);

        javax.swing.GroupLayout panelAlgorithmsLayout = new javax.swing.GroupLayout(panelAlgorithms);
        panelAlgorithms.setLayout(panelAlgorithmsLayout);
        panelAlgorithmsLayout.setHorizontalGroup(
            panelAlgorithmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(algorithmTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelAlgorithmsLayout.setVerticalGroup(
            panelAlgorithmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(algorithmTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAlgorithms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAlgorithms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) 
    {
        /* Set the Metal look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Algorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Algorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Algorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Algorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                new Algorithms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InsertionSort;
    private javax.swing.JPanel SelectionSort;
    private javax.swing.JTabbedPane algorithmTabbedPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JPanel panelAlgorithms;
    // End of variables declaration//GEN-END:variables
}
