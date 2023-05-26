package test;

import AimsProject.media.DigitalVideoDics;

public class TestPassingParameter {
    public static void main(String args[])
    {
        DigitalVideoDics jungleDVD = new DigitalVideoDics("Jungle");
        DigitalVideoDics cinderellaDVD = new DigitalVideoDics("Cinderella");
        swap(jungleDVD, cinderellaDVD);
        System.out.println("Jungle dvd title: "+ jungleDVD.getTitle());
        System.out.println("Cinderella dvd title: " + cinderellaDVD.getTitle());

        System.out.println("Jungle dvd title: "+ jungleDVD.getTitle());

    }

    public static void swap(Object o1, Object o2)
    {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(DigitalVideoDics dvd, String title)
    {
        String oldtitle = dvd.getTitle();
        dvd = DigitalVideoDics(title);
        dvd = new DigitalVideoDics(oldtitle);

    }

    private static DigitalVideoDics DigitalVideoDics(String title) {
        return null;
    }
}
