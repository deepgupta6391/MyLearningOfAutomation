package rough;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookingDates {
	@JsonProperty
	private Date checkin;
	
	@JsonProperty
	private Date checkout;
	
	

	public BookingDates(Date checkin, Date checkout) {
		super();
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Date getCheckin() {
		return checkin;
	}

	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
	
	
	

}
