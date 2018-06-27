package model;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public  class LoanFactory {
    public static Loan createLoan(Book book,Member member){
        Loan loan = new Loan();
        loan.setBook(book);
        loan.setMember(member);
        loan.setLoanDate(new Date());
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());
        calendar.add(calendar.DAY_OF_MONTH,1);
        loan.setDateForReturn(calendar.getTime());
        return loan;
    }
}
