package model;

public class Book {

    private Integer id;
    private String isbn;
    private String title;
    private Member loanTo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Member getLoanTo() {
        return loanTo;
    }

    public void setLoanTo(Member loanTo) {
        this.loanTo = loanTo;
    }
}
