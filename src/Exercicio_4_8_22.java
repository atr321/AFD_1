import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
public class Exercicio_4_8_22 extends Frame implements ActionListener {
 int mLargura = 500;
 FlowLayout mFL = new FlowLayout(FlowLayout.CENTER);
 Panel mPainel1;
 Panel mPainel2;
 Panel mPainel3;
 Panel mPainel4;
 Panel mPainel5;
 Label mLbFita;
 TextField mFita;
 Button mBtExecutar;
 TextArea mtxtExecucao;
 Button mBtFim;
//---> Construtor da Classe AFD01 ...
 Exercicio_4_8_22() {
	 super("AFD - Codigo da mercadoria");
	//------> Desenhar "lay-out" da tela...
	 mPainel1 = new Panel();
	 mPainel2 = new Panel();
	 mPainel3 = new Panel();
	 mPainel4 = new Panel();
	 mPainel5 = new Panel();
	 mLbFita = new Label("Digite abaixo a senten�a desejada");
	 mFita = new TextField(50);
	 mBtExecutar = new Button("Executar");
	 mtxtExecucao = new TextArea("Execu��o");
	 mBtFim = new Button("Fim");
	//------> Disposi��o dos pain�is...
	 mPainel1.setLocation(0,0);
	 mPainel1.setBackground(new Color(255,128,128));
	 mPainel1.setSize(mLargura,50);
	 mPainel1.add(mLbFita);
	 add(mPainel1);
	//
	 mPainel2.setLocation(0,50);
	 mPainel2.setBackground(new Color(255,255,255));
	 mPainel2.setSize(mLargura,50);
	 mPainel2.add(mFita);
	 add(mPainel2);
	//
	 mPainel3.setLocation(0,100);
	 mPainel3.setBackground(new Color(255,128,128));
	 mPainel3.setSize(mLargura,50);
	 mPainel3.add(mBtExecutar);
	 add(mPainel3);
	 mBtExecutar.addActionListener(this);
	//
	 mPainel4.setLocation(0,150);
	 mPainel4.setBackground(new Color(0,255,0));
	 mPainel4.setSize(mLargura,150);
	 mPainel4.add(mtxtExecucao);
	 add(mPainel4);
	//
	 mPainel5.setLocation(0,550);
	 mPainel5.setBackground(new Color(255,128,255));
	 mPainel5.setSize(mLargura,50);
	 mPainel5.add(mBtFim);
	 add(mPainel5);
	 mBtFim.addActionListener(this);
	//------> Mostar janela
	 this.resize(mLargura,600);
	 mFL.setHgap(100);
	 this.setLayout(mFL);
	 this.show();
	 }
	//----------------------------------------------------------
	//---> Processamento de Sentenca pelo AFD
	//----------------------------------------------------------
	 public void fProcessamentoPeloAFD() {
	 int vTamanhoFita = mFita.getText().length();
	 int iCursor;
	 String vPrimitivaLida;
	 String Q;
	 String vEnter = String.valueOf((char)13) + String.valueOf((char)10);
	 String vAux;
	//---> loop para processar a fita...
	 Q = "q0";
	 mtxtExecucao.setText("INICIO DO PROCESSAMENTO" + vEnter +
	"=========================" + vEnter);
	 for (iCursor = 0; iCursor < vTamanhoFita; iCursor++) {
	 vPrimitivaLida = mFita.getText().substring(iCursor,iCursor+1);
	 if ( (vPrimitivaLida.equalsIgnoreCase("b")) && (Q.equalsIgnoreCase("q0")) ) {
	 mtxtExecucao.append(Q + " x " + "espa�o em branco >>> ");
	 Q = "q1"; // estado � o mesmo...
	 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("a")) && (Q.equalsIgnoreCase("q1")) ) {
		 mtxtExecucao.append(Q + " x " + "a >> ");
		 Q = "q2"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("c")) && (Q.equalsIgnoreCase("q2")) ) {
		 mtxtExecucao.append(Q + " x " + "c >> ");
		 Q = "q5"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("a")) && (Q.equalsIgnoreCase("q0")) ) {
		 mtxtExecucao.append(Q + " x " + "a >> ");
		 Q = "q3"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("b")) && (Q.equalsIgnoreCase("q3")) ) {
		 mtxtExecucao.append(Q + " x " + "b >> ");
		 Q = "q4"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("c")) && (Q.equalsIgnoreCase("q4")) ) {
		 mtxtExecucao.append(Q + " x " + "c >> ");
		 Q = "q5"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("a")) && (Q.equalsIgnoreCase("q5")) ) {
		 mtxtExecucao.append(Q + " x " + "a >> ");
		 Q = "q7"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("b")) && (Q.equalsIgnoreCase("q5")) ) {
		 mtxtExecucao.append(Q + " x " + "b >> ");
		 Q = "q6"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("c")) && (Q.equalsIgnoreCase("q5")) ) {
		 mtxtExecucao.append(Q + " x " + "c >> ");
		 Q = "q6"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("a")) && (Q.equalsIgnoreCase("q6")) ) {
		 mtxtExecucao.append(Q + " x " + "a >> ");
		 Q = "q7"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("b")) && (Q.equalsIgnoreCase("q6")) ) {
		 mtxtExecucao.append(Q + " x " + "b >> ");
		 Q = "q6"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("c")) && (Q.equalsIgnoreCase("q6")) ) {
		 mtxtExecucao.append(Q + " x " + "c >> ");
		 Q = "q6"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("a")) && (Q.equalsIgnoreCase("q7")) ) {
		 mtxtExecucao.append(Q + " x " + "a >> ");
		 Q = "q7"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("b")) && (Q.equalsIgnoreCase("q7")) ) {
		 mtxtExecucao.append(Q + " x " + "b >> ");
		 Q = "q8"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("c")) && (Q.equalsIgnoreCase("q7")) ) {
		 mtxtExecucao.append(Q + " x " + "c >> ");
		 Q = "q6"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("a")) && (Q.equalsIgnoreCase("q8")) ) {
		 mtxtExecucao.append(Q + " x " + "a >> ");
		 Q = "q7"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("b")) && (Q.equalsIgnoreCase("q8")) ) {
		 mtxtExecucao.append(Q + " x " + "b >> ");
		 Q = "q9"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("c")) && (Q.equalsIgnoreCase("q8")) ) {
		 mtxtExecucao.append(Q + " x " + "c >> ");
		 Q = "q6"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("a")) && (Q.equalsIgnoreCase("q9")) ) {
		 mtxtExecucao.append(Q + " x " + "a >> ");
		 Q = "q11"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("b")) && (Q.equalsIgnoreCase("q9")) ) {
		 mtxtExecucao.append(Q + " x " + "b >> ");
		 Q = "q9"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("c")) && (Q.equalsIgnoreCase("q9")) ) {
		 mtxtExecucao.append(Q + " x " + "c >> ");
		 Q = "q10"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("a")) && (Q.equalsIgnoreCase("q10")) ) {
		 mtxtExecucao.append(Q + " x " + "a >> ");
		 Q = "q12"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("b")) && (Q.equalsIgnoreCase("q10")) ) {
		 mtxtExecucao.append(Q + " x " + "b >> ");
		 Q = "q9"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("c")) && (Q.equalsIgnoreCase("q10")) ) {
		 mtxtExecucao.append(Q + " x " + "c >> ");
		 Q = "q11"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("a")) && (Q.equalsIgnoreCase("q11")) ) {
		 mtxtExecucao.append(Q + " x " + "a >> ");
		 Q = "q11"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("b")) && (Q.equalsIgnoreCase("q11")) ) {
		 mtxtExecucao.append(Q + " x " + "b >> ");
		 Q = "q9"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("c")) && (Q.equalsIgnoreCase("q11")) ) {
		 mtxtExecucao.append(Q + " x " + "c >> ");
		 Q = "q11"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("a")) && (Q.equalsIgnoreCase("q12")) ) {
		 mtxtExecucao.append(Q + " x " + "a >> ");
		 Q = "q11"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("b")) && (Q.equalsIgnoreCase("q12")) ) {
		 mtxtExecucao.append(Q + " x " + "b >> ");
		 Q = "q9"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 else if ( (vPrimitivaLida.equalsIgnoreCase("c")) && (Q.equalsIgnoreCase("q12")) ) {
		 mtxtExecucao.append(Q + " x " + "c >> ");
		 Q = "q11"; // estado � o mesmo...
		 mtxtExecucao.append(Q + vEnter);
	 }
	 
	//======>>> ALUNO !!!! CODIFICAR AQUI O RESTANTE DO AFD !!!!!
	 }
	//---> Senten�a foi aceita ?
	 mtxtExecucao.append(vEnter + "-----------------------------------" + vEnter);
	 if (Q.equalsIgnoreCase("q12")) {
	 mtxtExecucao.append("Senten�a ACEITA !!!" + vEnter);
	 }
	 else {
	 mtxtExecucao.append("Senten�a REJEITADA !!!" + vEnter);
	 }
	 mtxtExecucao.append("-----------------------------------" + vEnter);
	 mtxtExecucao.append(vEnter + "*** FIM ***" + vEnter);
	 }
	//-----------------------------------
	//---> Listener
	//-----------------------------------
	 public void actionPerformed(ActionEvent e) {
	 if (e.getActionCommand() == "Fim") {
	 System.exit(0);
	 }
	 if (e.getActionCommand() == "Executar") {
	 fProcessamentoPeloAFD();
	 }
	 }
	//------------------------
	//---> Programa principal
	//------------------------
	 public static void main(String[] args) {
	 new Exercicio_4_8_22();
	 }
	}