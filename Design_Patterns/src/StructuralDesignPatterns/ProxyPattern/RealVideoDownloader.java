package StructuralDesignPatterns.ProxyPattern;

public class RealVideoDownloader implements VideoDownloader {
    @Override
    public String downloadVideo(String videoUrl) {
        System.out.println("Downloading video " + videoUrl);
        String video = "Video";
        return video;
    }
}
