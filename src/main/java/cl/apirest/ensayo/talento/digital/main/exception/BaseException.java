package cl.apirest.ensayo.talento.digital.main.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
	
@Getter
@Setter
@AllArgsConstructor
public class BaseException extends Exception {
	
	private static final long serialVersionUID = 1L;
    private int codigo;
    private String descripcion;
    
    public BaseException(Throwable e) {

        super(e);
    }
}
