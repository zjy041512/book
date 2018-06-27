package model;

import java.util.List;

public class LoanOnlyOneSpecification implements Specification<Member> {

    private Book wantBook;
    public LoanOnlyOneSpecification(Book book) {
        this.wantBook =book;
    }

    @Override
    public boolean isSatisfiedBy(Member entity) {
        List<Loan> loans=entity.getLoans();
        for (Loan loan : loans){
            if (loan.getBook().getId() == wantBook.getId()){
                return false;
            }
        }
        return true;
    }

    public Book getWantBook() {
        return wantBook;
    }

    public void setWantBook(Book wantBook) {
        this.wantBook = wantBook;
    }
}
