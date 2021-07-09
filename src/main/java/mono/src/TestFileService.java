package mono.src;

import mono.src.Fileservice;
import mono.src.Utils;

public class TestFileService {
    public static void main(String[] args) {
        Fileservice.read("file.txt").subscribe(Utils.onNext(), Utils.onError(), Utils.onComplete());

    }

}
