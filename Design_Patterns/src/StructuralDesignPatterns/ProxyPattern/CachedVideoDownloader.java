package StructuralDesignPatterns.ProxyPattern;

import java.util.HashMap;
import java.util.Map;

public class CachedVideoDownloader implements VideoDownloader {
    private RealVideoDownloader videoDownloader;
    private Map<String, String> cache;

    public CachedVideoDownloader() {
        videoDownloader = new RealVideoDownloader();
        cache = new HashMap<>();
    }

    @Override
    public String downloadVideo(String videoURL) {
        if (cache.containsKey(videoURL)) {
            System.out.println("Video already exists in cache");
            return cache.get(videoURL);
        }
        String video = videoDownloader.downloadVideo(videoURL);
        cache.put(videoURL, video);
        return video;
    }
}
