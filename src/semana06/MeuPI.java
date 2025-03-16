package semana06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MeuPI extends JFrame {
	private JButton btOriginal;
	private Botao btPersonal;
	private JLabel lbNum1, lbNum2, lbResultado; //labels
	private JTextField tfNum1, tfNum2, tfResultado; //caixa de input
	
	public MeuPI() { //caracteristicas da tela
		setTitle("Meu PI");
		setBounds(100,100,350,300); //x,y do canto sup esquerdo; largura,altura da tela
		setLayout(null);
		setResizable(false);
		
		lbNum1 = new JLabel("Num1: ");
		lbNum2 = new JLabel("lbNum2: ");
		lbResultado = new JLabel("lbResultado: ");
		
		tfNum1 = new JTextField();
		tfNum2 = new JTextField();
		tfResultado = new JTextField();
		tfResultado.setEditable(false);
		
		btOriginal = new JButton("Somar");
		btOriginal.setMnemonic('S'); // Atalho teclado (Alt+S)
		btOriginal.setToolTipText("Realiza a soma");
		
		btPersonal = new Botao("Limpar");
		btPersonal.setMnemonic('L');
		btPersonal.setToolTipText("Limpa os campos");
		
		lbNum1.setBounds(10,10,110,25);
		lbNum2.setBounds(10,60,110,25);
		lbResultado.setBounds(10,110,150,25);
		
		tfNum1.setBounds(130,10,150,25);
		tfNum2.setBounds(130,60,150,25);
		tfResultado.setBounds(130,110,150,25);
		
		btOriginal.setBounds(50,180,100,25); // x,y do frame; largura, altura do botao
		btPersonal.setBounds(170,180,100,25);
		
		add(lbNum1);
		add(lbNum2);
		add(lbResultado);
		
		add(tfNum1);
		add(tfNum2);
		add(tfResultado);
		
		add(btOriginal);
		add(btPersonal);
		
		btOriginal.addActionListener(new ActionListener() { //Ouvidor de ação - monitora botão
			public void actionPerformed(ActionEvent e) {//somar
				try {
				double n1 = Double.parseDouble(tfNum1.getText());
				double n2 = Double.parseDouble(tfNum2.getText());
				tfResultado.setText("" + (n1+n2));
				}
				catch(NumberFormatException erro) {
					JOptionPane.showMessageDialog(btOriginal, "Forneça dois números!"); // primeira variavel é local que vai aparecer a mensagem
				}
			}
		});
		
		btPersonal.addActionListener(new ActionListener() { //Ouvidor de ação - monitora botão
			public void actionPerformed(ActionEvent e) {//sair
				//System.exit(0); para sair
				
				//nova operação - limpar
				tfNum1.setText("");
				tfNum2.setText("");
				tfResultado.setText("");
				tfNum1.requestFocus(); //Após limpar, foca a digitação no Num1
			}
		});
	}
	
	public static void main(String[] args) {
		MeuPI m = new MeuPI();
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

}
