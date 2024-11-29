package design.facade;

import design.facade.facade.VideoConversionFacade;
import java.io.File;

public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.converVideo("youtubevideo.ogg", "mp4");
    }
}
