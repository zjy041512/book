package test;

import model.Book;
import model.HasReachMaxSpecification;
import model.Loan;
import model.Member;


public class BorrowBookTest {
    public static void main(String[] args) {
        //借书流程
        Book book = new Book();
        book.setId(1);
        book.setIsbn("123");
        book.setTitle("java");
        Member member = new Member();
        //book.setLoanTo(member);
        if (member.canLoan(book)) {

            Loan loan =member.loan(book);
            System.out.println(loan);
            member.getLoans().add(loan);
        }

    }
}
