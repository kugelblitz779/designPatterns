package StructuralDesignPatterns.ProxyPattern;

public class Main {
    public static void main(String[] args) {

        VideoDownloader videoDownloader = new CachedVideoDownloader();
        videoDownloader.downloadVideo("https://www.google.com/");

        videoDownloader.downloadVideo("https://www.google.com/");
        videoDownloader.downloadVideo("https://www.youtube.com/");
    }
}
