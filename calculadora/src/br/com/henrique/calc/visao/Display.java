package br.com.henrique.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.henrique.calc.modelo.Memoria;
import br.com.henrique.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {

	private final JLabel label;

	public Display() {
		Memoria.getInstancia().adicionarobservador(this);

		setBackground(new Color(250, 250, 250));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.BLACK);
		label.setFont(new Font("courier", Font.PLAIN, 30));

		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));

		add(label);
	}

	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
	}
}
