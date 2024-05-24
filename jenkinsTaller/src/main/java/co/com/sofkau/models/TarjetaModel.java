package co.com.sofkau.models;

public class TarjetaModel {
    private String number;
    private String userName;
    private String month;
    private String year;
    private String secureCode;
    private String userId;

    public TarjetaModel(String number, String userName, String month, String year, String secureCode, String userId) {
        this.number = number;
        this.userName = userName;
        this.month = month;
        this.year = year;
        this.secureCode = secureCode;
        this.userId = userId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSecureCode() {
        return secureCode;
    }

    public void setSecureCode(String secureCode) {
        this.secureCode = secureCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "TarjetaModel{" +
                "number='" + number + '\'' +
                ", userName='" + userName + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                ", secureCode='" + secureCode + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
