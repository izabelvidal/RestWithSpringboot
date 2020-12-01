package br.com.bel;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.bel.exception.UnsupportedMathOperationExecption;

@RestController
public class MathController {
	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sum(@PathParam("numberOne") String numberOne, @PathParam("numberTwo") String numberTwo) throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationExecption("Please set a numeric value");
		}
		
		double sum = convertToDouble(numberOne) + convertToDouble(numberTwo);
		return sum;
	}
	
	@RequestMapping(value="/sub/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sub(@PathParam("numberOne") String numberOne, @PathParam("numberTwo") String numberTwo) throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationExecption("Please set a numeric value");
		}
		
		double sub = convertToDouble(numberOne) - convertToDouble(numberTwo);
		return sub;
	}
	
	@RequestMapping(value="/mult/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double mult(@PathParam("numberOne") String numberOne, @PathParam("numberTwo") String numberTwo) throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationExecption("Please set a numeric value");
		}
		
		double mult = convertToDouble(numberOne) * convertToDouble(numberTwo);
		return mult;
	}
	
	@RequestMapping(value="/div/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double div(@PathParam("numberOne") String numberOne, @PathParam("numberTwo") String numberTwo) throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationExecption("Please set a numeric value");
		}
		
		double div = convertToDouble(numberOne) + convertToDouble(numberTwo);
		return div;
	}
	
	@RequestMapping(value="/mean/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double mean(@PathParam("numberOne") String numberOne, @PathParam("numberTwo") String numberTwo) throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationExecption("Please set a numeric value");
		}
		
		double mean = (convertToDouble(numberOne) + convertToDouble(numberTwo))/2;
		return mean;
	}
	
	@RequestMapping(value="/squareRoot/{numberOne}", method=RequestMethod.GET)
	public Double squareRoot(@PathParam("numberOne") String numberOne) throws Exception {
		if (!isNumeric(numberOne)) {
			throw new UnsupportedMathOperationExecption("Please set a numeric value");
		}
		
		double squareRoot = Math.sqrt(convertToDouble(numberOne));
		return squareRoot;
	}

	private Double convertToDouble(String strNumber) {
		if (strNumber == null) return 0d; 
        String number = strNumber.replaceAll(",", ".");
        if (isNumeric(number)) return Double.parseDouble(number);
        return 0d;
	}

	private boolean isNumeric(String strNumber) {
		if(strNumber == null) return false;
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
