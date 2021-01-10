package com.core.java.utils.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
    public static void main(String[] a) throws IOException {
        long l1 = System.currentTimeMillis();
        byte[] oneKBBytes = "imcDDzWxqDp7lEPRIUQgoWxnSOcZYEQNFuiUJH5ycIzte2L3MiHRv5dq7ZqukvfegdMeyONoJGqgtMRLAcxc6tAx5Oogw235e0hDmaF5czH8Lz5HZg5YqpvjTgfDPvK4UGXejkXHpmfIoAXzNbUdaQ21zV0aL5PNQFHJekOEAvvnFe8vo7DU53zdIQsbJIL77i0HBqHlaVULQFRpINj4EYmc86zV9R3jJrdXmtmPfg8Wi0iCbOuCPyZX4EL2E7qIzAxhQKMRuXFSiGLxoxC7S4s5yyHMpP5O7ATOquUkzFAAEgUExa8W0nj2brN3bzuSNcBUitKwbmlEnT8UUqokMCcTgTpcc7As8P73IsGjwjwQyMl9DIRc3CN5dVgXkRKlWDZRWnpNpFEizBZ3iEsFvleDhWB62WVnVnFTv67RGjXGL9xMsS7M2HqYIqdkxfStW1zJJAUvtul42mDPEVXTwCnV90FIXWpmST6UVAvBe5cQ2p0LQy5d8DeNqqY587rSwBHTf2ThYstRl4yA6hHq1Pvr0Mm8Q1wzyW4vDuDkRASEZlj1rRQL3WnXpyI0jD5vP8BgJrJNoDbx68i0aGToJlE1jjO6TxRx8QIV2L7SrqsOi9B6t0Z8cs4ddEEBKMLSIVowLTKXkLpzZpoyXLfzbjvK4JpHicjbuTCjwob4wHs43kA6UYJ6VeKzS561DaPqPyRGyOTJx6UgVPPFU013auQH5iMSkMoPEOHHuYiGKJJjKyLMb4k2saNeFOhJbeorW930FsMYCA7rq9xHQ90dlzdBYSLClELdko80umo8CMKhmvb5D7s2lAurkmTTgCdUglB79rKaZjAKiBet48dwvX3osGMrVZhPR9iYUnYEaLNXeUruGb92ij0wR6PGtSBSqkHjlc4kV7shpGtQROEIioSGo9TNuHtQSTO1DNPhUVSutvnG1p8ivQCI48mmGEaM7pDZnd8h0mLXK5BLqLiYrnRyP4CmzkcpEzUIPwFuJniGi5o2mtWSpFSm6mFSbt1Z".getBytes();
        File f = new File("/Users/rmoguluri/sample.txt");
        f.createNewFile();
        FileOutputStream fos = new FileOutputStream(f, true);
        for(int i=0; i< 1024* 1024* 70; i++){
            fos.write(oneKBBytes);
        }
        fos.close();
        long l2 = System.currentTimeMillis();
        System.out.println("Time taken : "+ (l2-l1)+" seconds");
    }
}
