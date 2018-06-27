package test;

import model.Book;
import model.Loan;
import model.Member;

import java.util.ArrayList;

public class ReturnBookTest {
    public static void main(String[] args){
        //还书流程
        Member member = new Member();
        ArrayList<Loan> loans = member.getLoans();
        for (Loan loan : loans){
            member.returnBook(loan.getBook());
        }
    }
}
