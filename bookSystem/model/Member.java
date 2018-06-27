package model;

import java.util.ArrayList;

public class Member {
    private Integer id;
    private String name;
    private ArrayList<Loan> loans = new ArrayList<>();
    //能否借阅
    public boolean canLoan(Book book){
        if(book.getLoanTo() == null){
            return true;
        }
        return false;
    }

    //还书
    public void returnBook(Book book){
        Loan loan = findCurrentLoanFor(book);
        if(loan != null){
            loan.markAsReturned();
            book.setLoanTo(null);
        }
    }
    //借书
    public Loan loan(Book book){
        Loan loan = null;
        if (canLoan(book)) {
            loan = LoanFactory.createLoan(book,this);
            getLoans().add(loan);
        }
        return loan;
    }


    public Loan findCurrentLoanFor(Book book){
        for (Loan loan:loans){
            if(loan.getBook().getId() == book.getId()){
                return loan;
            }
        }
        return null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public void setLoans(ArrayList<Loan> loans) {
        this.loans = loans;
    }
}
