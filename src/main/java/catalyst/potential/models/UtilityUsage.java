package catalyst.potential.models;

/**
 * Created by rgb24 on 5/6/15.
 */
public class UtilityUsage {

    private String electricityUtility;

    private String rateSchedule;

    private String anualKwh;

    private String lowBill;

    private String lowElectricityBill;

    private String averageElectricityBill;

    private String highElectricityBill;

    private CalendarObject usageCalendar;

    private CalendarObject billCalendar;

    public String getElectricityUtility() {
        return electricityUtility;
    }

    public void setElectricityUtility(String electricityUtility) {
        this.electricityUtility = electricityUtility;
    }

    public String getRateSchedule() {
        return rateSchedule;
    }

    public void setRateSchedule(String rateSchedule) {
        this.rateSchedule = rateSchedule;
    }

    public String getAnualKwh() {
        return anualKwh;
    }

    public void setAnualKwh(String anualKwh) {
        this.anualKwh = anualKwh;
    }

    public String getLowBill() {
        return lowBill;
    }

    public void setLowBill(String lowBill) {
        this.lowBill = lowBill;
    }

    public String getLowElectricityBill() {
        return lowElectricityBill;
    }

    public void setLowElectricityBill(String lowElectricityBill) {
        this.lowElectricityBill = lowElectricityBill;
    }

    public String getAverageElectricityBill() {
        return averageElectricityBill;
    }

    public void setAverageElectricityBill(String averageElectricityBill) {
        this.averageElectricityBill = averageElectricityBill;
    }

    public String getHighElectricityBill() {
        return highElectricityBill;
    }

    public void setHighElectricityBill(String highElectricityBill) {
        this.highElectricityBill = highElectricityBill;
    }

    public CalendarObject getUsageCalendar() {
        return usageCalendar;
    }

    public void setUsageCalendar(CalendarObject usageCalendar) {
        this.usageCalendar = usageCalendar;
    }

    public CalendarObject getBillCalendar() {
        return billCalendar;
    }

    public void setBillCalendar(CalendarObject billCalendar) {
        this.billCalendar = billCalendar;
    }
}
