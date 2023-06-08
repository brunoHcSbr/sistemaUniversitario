package view;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *  @author Bruno Henrique
 */

public class LimitaCaracteres extends PlainDocument{
	
	
	private static final long serialVersionUID = 1L;

	public enum TipoEntrada{
		NUMEROINTEIRO, NUMERODECIMAL, NOME, EMAIL;
	};
	
	private int qtdCaracteres;
	private TipoEntrada tpEntrada;
	
	public LimitaCaracteres(int qtdCaracteres, TipoEntrada tpEntrada) {
		this.qtdCaracteres = qtdCaracteres;
		this.tpEntrada = tpEntrada;
	}
	
	@Override
	public void insertString(int i, String str, AttributeSet as) throws BadLocationException {
		if (str == null || getLength() == qtdCaracteres) {
			return;
		}
		int totalCarac = getLength() + str.length();
		
		String regex = "";
		
		switch(tpEntrada) {
			case NUMEROINTEIRO: regex = "[^0-9]"; break;
			case NUMERODECIMAL: regex = "[^0-9,.]"; break;
			case NOME: regex = "[^\\p{IsLatin} ]"; break;
			case EMAIL: regex = "[^\\p{IsLatin}@.\\-_ ] [^0-9]"; break;
		}
		str = str.replaceAll(regex, "");
		
		if (totalCarac <= qtdCaracteres) {
			super.insertString(i, str, as);
		}
		else {
			String nova = str.substring(0, qtdCaracteres);
			super.insertString(i, nova, as);
		}
		
		
	}
	
}
