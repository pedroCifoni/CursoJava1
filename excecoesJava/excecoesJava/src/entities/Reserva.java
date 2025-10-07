package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.ExcecoesData;

public class Reserva {
	Integer numero;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date checkIn, checkOut;
	public Reserva(Integer numero, Date checkIn, Date checkOut) throws ExcecoesData {
		if(!checkOut.after(checkIn)) {
			throw new ExcecoesData("A data do check out deve ser depois da do check in!");
		}
		this.numero = numero;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}
	
	
	public long duration() {
		long diferenca = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
		
		
	}
	public void updateDates(Date checkIn, Date checkOut) throws ExcecoesData{
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			throw new ExcecoesData("As datas atualizadas devem ser datas futuras!");
		}
		if(!checkOut.after(checkIn)) {
			throw new ExcecoesData("A data do check out deve ser depois da do check in!");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
	}
	
	@Override
	public String toString() {
		return "Quarto"
				+ numero 
				+ ", check-in:" 
				+ sdf.format(checkIn)
				+ ", check-out:" 
				+ sdf.format(checkOut)
				+ ","
				+ duration()
				+ "Nights!";
				
	}
	
}

	
	
	
