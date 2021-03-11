package Lap.S7;

public class Main {
    public static void main(String[] args) {
        News n = new News();
        n.setTittle("Covid19");
        n.setId(1);
        n.setAuthor("VTVGO");
        n.setContent("Covid");
        n.setPublishDate("11/3/2021");
        n.RateList.add(4);
        n.RateList.add(4);
        n.RateList.add(4);
        n.Display();

    }
}
