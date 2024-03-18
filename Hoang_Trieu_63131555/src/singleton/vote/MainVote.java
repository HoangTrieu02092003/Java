package singleton.vote;

public class MainVote {
    public static void main(String[] args) {
        User trieu = new User("Triều");
        User than = new User("Thân");
        User lam = new User("Lâm");
        User toan = new User("Toàn");
        trieu.vote(Candidate.TRUMP);
        trieu.vote(Candidate.TRUMP);
        than.vote(Candidate.TRUMP);
        than.vote(Candidate.BIDEN);
        lam.vote(Candidate.BIDEN);
        toan.vote(Candidate.TRUMP);
        Election.getInstance().inKetQua();
    }
}
