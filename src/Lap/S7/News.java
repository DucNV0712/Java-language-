package Lap.S7;

import java.util.ArrayList;

public class News implements INews {
    int id;
    String tittle;
    String publishDate;
    String author;
    String content;
    float averageRate;
    ArrayList<Integer>RateList;

    public News() {
        RateList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }


    @Override
    public void Display() {
        System.out.println("Tiêu đề:"+getTittle());
        System.out.println("Ngày:"+getPublishDate());
        System.out.println("Tác Gỉa:"+getAuthor());
        System.out.println("Nội Dung:"+getContent());
        System.out.println("Đánh Gía :"+getAverageRate());

    }
    public void Calculate(){
        float a = 0;
        for (Integer x:RateList){
            a+=x;

        }
        this.averageRate = a/(RateList.size());
    }
}



