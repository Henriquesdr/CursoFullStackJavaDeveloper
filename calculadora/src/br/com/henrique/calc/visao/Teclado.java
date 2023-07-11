package br.com.henrique.calc.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.henrique.calc.modelo.Memoria;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener {

	private final Color COR_CINZA = new Color(150, 150, 150);
	private final Color COR_BRANCO = new Color(230, 230, 230);

	public Teclado() {
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();

		setLayout(layout);
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;

		c.gridwidth = 2;
		adicionarBotao("AC", COR_CINZA, c, 0, 0);
		c.gridwidth = 1;
		adicionarBotao("±", COR_CINZA, c, 2, 0);
		adicionarBotao("/", COR_CINZA, c, 3, 0);

		adicionarBotao("7", COR_BRANCO, c, 0, 1);
		adicionarBotao("8", COR_BRANCO, c, 1, 1);
		adicionarBotao("9", COR_BRANCO, c, 2, 1);
		adicionarBotao("*", COR_CINZA, c, 3, 1);

		adicionarBotao("4", COR_BRANCO, c, 0, 2);
		adicionarBotao("5", COR_BRANCO, c, 1, 2);
		adicionarBotao("6", COR_BRANCO, c, 2, 2);
		adicionarBotao("-", COR_CINZA, c, 3, 2);

		adicionarBotao("1", COR_BRANCO, c, 0, 3);
		adicionarBotao("2", COR_BRANCO, c, 1, 3);
		adicionarBotao("3", COR_BRANCO, c, 2, 3);
		adicionarBotao("+", COR_CINZA, c, 3, 3);

		adicionarBotao(",", COR_BRANCO, c, 0, 4);
		adicionarBotao("0", COR_BRANCO, c, 1, 4);
		c.gridwidth = 2;
		adicionarBotao("=", COR_CINZA, c, 2, 4);

	}

	private void adicionarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {

		c.gridx = x;
		c.gridy = y;
		Botao botao = new Botao(texto, cor);
		botao.addActionListener(this);
		add(botao, c);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton botao = (JButton) e.getSource();
			Memoria.getInstancia().processarComando(botao.getText());
		}
	}
}
