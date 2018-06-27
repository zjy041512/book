package model;

public class HasReachMaxSpecification implements Specification<Member> {
    @Override
    public boolean isSatisfiedBy(Member entity) {
        return entity.getLoans().size()>3;
    }
}
