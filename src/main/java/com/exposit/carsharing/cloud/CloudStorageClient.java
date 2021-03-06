package com.exposit.carsharing.cloud;

import com.dropbox.core.DbxException;

import java.io.IOException;
import java.io.InputStream;

public interface CloudStorageClient {
    void uploadFile(InputStream file, String path) throws IOException, DbxException;

    String createSharedLink(String path) throws DbxException;

    void removeFile(String path) throws DbxException;

    void createFolder(String path) throws DbxException;

    void removeFolder(String path) throws DbxException;
}
