package model;

import java.util.Date;

public class Loan {

    private Integer id;
    private Date loanDate;
    private Date dateForReturn;
    private Date returnDate;
    private Book book;
    private Member member;
    //还没有还书，所以还书日期为null
    public boolean hasNotBeenReturned(){
        return returnDate ==null;
    }
    public void markAsReturned(){
        returnDate = new Date();
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getDateForReturn() {
        return dateForReturn;
    }

    public void setDateForReturn(Date dateForReturn) {
        this.dateForReturn = dateForReturn;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "loanId;" + id +"借书日期："+loanDate ;
    }
}
