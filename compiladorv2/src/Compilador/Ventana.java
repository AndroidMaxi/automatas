package compilador;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class Ventana extends JFrame implements ActionListener{
		// Menu Archivo
		private JFileChooser ventanaArchivos;
		private File archivo;
		private String [] titulos ={"Tipo","Nombre","Valor","Alcance","Posicion"};
		private String [] titulos2 = {"Operador","Operando1","Operando2","Resultado"};
		private JList<String> codigo = new JList<String>();;
		private JButton btnAbrir, btnCompilar;
		
		DefaultTableModel modelo = new DefaultTableModel(new Object[0][0],titulos);
		DefaultTableModel modelo2 = new DefaultTableModel(new  Object[0][0],titulos2);
		private JTable jtSimbolos;
		private JTextArea areaTexto;
		private JList<String> tokens;
		private JTable jtCuadruplos;
		
		
		public static void main(String[] args) {
			
			new Ventana();
		}
		
		public Ventana() {
			super("Compilador"); //Analizador Lexico y Sintáctico
			setTitle("Lenguajes y Automatas 2 Compilador");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setSize(1030,650);
			setLocationRelativeTo(null);
			getContentPane().setLayout(null);
			
			btnAbrir = new JButton("Abrir");
			btnAbrir.setBackground(SystemColor.activeCaption);
			btnAbrir.setForeground(Color.BLACK);
			btnAbrir.setFont(new Font("Montserrat", Font.PLAIN, 17));
			btnAbrir.addActionListener(this);
		
			btnAbrir.setBounds(21, 21, 114, 51);
			getContentPane().add(btnAbrir);
			
			JTabbedPane tpPrograma = new JTabbedPane(JTabbedPane.TOP);
			tpPrograma.setBorder(null);
			tpPrograma.setBounds(21, 121, 457, 209);
			getContentPane().add(tpPrograma);
			
			areaTexto = new JTextArea();
			areaTexto.setFont(new Font("Consolas", Font.PLAIN, 12));
			JScrollPane spPrograma = new JScrollPane(areaTexto);
			tpPrograma.addTab("Codigo", null, spPrograma, null);
			tpPrograma.setBackgroundAt(0, Color.WHITE);
			
			JLabel lblPrograma = new JLabel("Programa");
			lblPrograma.setFont(new Font("Montserrat", Font.PLAIN, 18));
			lblPrograma.setBounds(27, 83, 101, 26);
			getContentPane().add(lblPrograma);
			
			JLabel lblTablaDeSimbolos = new JLabel("Tabla De Simbolos");
			lblTablaDeSimbolos.setFont(new Font("Montserrat", Font.PLAIN, 18));
			lblTablaDeSimbolos.setBounds(27, 341, 199, 26);
			getContentPane().add(lblTablaDeSimbolos);
			
			JTabbedPane tpSimbolos = new JTabbedPane(JTabbedPane.TOP);
			tpSimbolos.setBorder(null);
			tpSimbolos.setBounds(27, 378, 457, 209);
			getContentPane().add(tpSimbolos);
			
			JScrollPane spSimbolos = new JScrollPane();
			tpSimbolos.addTab("Tabla", null, spSimbolos, null);
			
			jtSimbolos = new JTable(modelo);
			spSimbolos.setViewportView(jtSimbolos);
			
			btnCompilar = new JButton("Compilar");
			btnCompilar.setForeground(Color.BLACK);
			btnCompilar.setFont(new Font("Montserrat", Font.PLAIN, 17));
			btnCompilar.setBackground(SystemColor.activeCaption);
			btnCompilar.setBounds(145, 21, 114, 51);
			getContentPane().add(btnCompilar);
			btnCompilar.addActionListener(this);
			
			JLabel lblAnalizador = new JLabel("Analizador");
			lblAnalizador.setFont(new Font("Montserrat", Font.PLAIN, 18));
			lblAnalizador.setBounds(537, 83, 101, 26);
			getContentPane().add(lblAnalizador);
			
			JTabbedPane tpAnalizador = new JTabbedPane(JTabbedPane.TOP);
			tpAnalizador.setBorder(null);
			tpAnalizador.setBounds(537, 121, 457, 209);
			getContentPane().add(tpAnalizador);
			
			tokens=new JList<String>();
			JScrollPane spAnalizador = new JScrollPane(tokens);
			tpAnalizador.addTab("Consola", null, spAnalizador, null);
			
			JTabbedPane tpCuadruplos = new JTabbedPane(JTabbedPane.TOP);
			tpCuadruplos.setBorder(null);
			tpCuadruplos.setBounds(537, 378, 457, 209);
			getContentPane().add(tpCuadruplos);
			
			JScrollPane scrollPane = new JScrollPane();
			tpCuadruplos.addTab("Tabla", null, scrollPane, null);
			
			jtCuadruplos = new JTable(modelo2);
			scrollPane.setViewportView(jtCuadruplos);
			
			ventanaArchivos = new JFileChooser();
			
			JLabel lblCuadruplos = new JLabel("Cuadruplos");
			lblCuadruplos.setFont(new Font("Montserrat", Font.PLAIN, 18));
			lblCuadruplos.setBounds(537, 350, 121, 26);
			getContentPane().add(lblCuadruplos);
			
			JLabel lblIntegrantes = new JLabel("Integrantes:");
			lblIntegrantes.setFont(new Font("Montserrat", Font.PLAIN, 18));
			lblIntegrantes.setBounds(623, 11, 121, 26);
			getContentPane().add(lblIntegrantes);
			
			JLabel lblKevinAxellEspinoza = new JLabel("Kevin Axell Espinoza Sanchez");
			lblKevinAxellEspinoza.setFont(new Font("Montserrat", Font.PLAIN, 18));
			lblKevinAxellEspinoza.setBounds(623, 32, 281, 26);
			getContentPane().add(lblKevinAxellEspinoza);
			
			JLabel lblLuisEnriqueHernandez = new JLabel("Luis Enrique Hernandez Mejia");
			lblLuisEnriqueHernandez.setFont(new Font("Montserrat", Font.PLAIN, 18));
			lblLuisEnriqueHernandez.setBounds(623, 56, 281, 26);
			getContentPane().add(lblLuisEnriqueHernandez);
			setVisible(true);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnCompilar) {
				if(guardar()){
					Analisis analisador = new Analisis(archivo.getAbsolutePath());
					tokens.setListData(analisador.getmistokens().toArray( new String [0]));
					codigo.setListData(analisador.getTabla3().toArray( new String [0] ));
					modelo = new DefaultTableModel(new Object[0][0],titulos);
					modelo2 = new DefaultTableModel(new Object[0][0],titulos2);
					
					jtSimbolos.setModel(modelo);
					
					for (int i = 0; i <analisador.getIdenti().size(); i++) {
						Identificador id = analisador.getIdenti().get(i);
						if(!id.tipo.equals("")) {
							Object datostabla[] = {id.tipo,id.nombre,id.valor, id.Alcance, id.Posicion};
							modelo.addRow(datostabla);
							
						}
					}
					
					//
					for (int i=0; i < analisador.getIdenti2().size(); i++) {
						arbol id2 =analisador.getIdenti2().get(i);								
						jtCuadruplos.setModel(modelo2);
							Object datostabla2[]= {id2.operador,id2.argumento1,id2.argumento2,id2.resultado};

							modelo2.addRow(datostabla2);
							
							
							if(id2.operador.equals("=")){
								Object datostabla3[]= {" "," "," "," "," "};
								modelo2.addRow(datostabla3);
							}
						
					}
					
					//
					
					
					

				}
			
				return;
			}
			if(e.getSource()==btnAbrir) {
				ventanaArchivos.setDialogTitle("Abrir..");
				ventanaArchivos.setFileSelectionMode(JFileChooser.FILES_ONLY);
				if(ventanaArchivos.showOpenDialog(this)==JFileChooser.CANCEL_OPTION) 
					return;
				archivo=ventanaArchivos.getSelectedFile();
				abrir();
			}
		
		}
		
		public boolean guardar() {
			try {
				if(archivo==null) {
					ventanaArchivos.setDialogTitle("Guardando..");
					ventanaArchivos.setFileSelectionMode(JFileChooser.FILES_ONLY);
					if(ventanaArchivos.showSaveDialog(this)==JFileChooser.CANCEL_OPTION) 
						return false;
					archivo=ventanaArchivos.getSelectedFile();
				}
				FileWriter fw = new FileWriter(archivo);
				BufferedWriter bf = new BufferedWriter(fw);
				bf.write(areaTexto.getText());
				bf.close();
				fw.close();
			}catch (Exception e) {
				System.out.println("Ha ocurrido un error al guardar el programa");
				return false;
			}
			return true;	
		}
		
		public boolean abrir() {
			String texto="",linea;
			try {
				FileReader fr = new FileReader(archivo) ; 
				BufferedReader br= new BufferedReader(fr);
				while((linea=br.readLine())!=null) 
					texto+=linea+"\n";
				areaTexto.setText(texto);
				return true;
			}catch (Exception e) {
				archivo=null;
				JOptionPane.showMessageDialog(null, "Tipo de archivo incompatible", "Warning",
						JOptionPane.WARNING_MESSAGE);
				return false;
			}
			
		}
}
