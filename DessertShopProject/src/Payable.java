package week3;

public interface Payable {
    public enum PayType { CASH, CARD, PHONE } //-- represents a *list* of numbers

    public PayType getPayType();
    public void setPayType(PayType payType);
}
