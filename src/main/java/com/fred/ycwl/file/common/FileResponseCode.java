package com.fred.ycwl.file.common;

import com.fred.ycwl.common.web.ResponseCode;

/**
 *
 * <b>Description:.</b><br> 
 * @author <b>sil.zhou</b>
 * <br><b>ClassName:</b> 
 * <br><b>Date:</b> 2019/4/23 09:56
 */
public class FileResponseCode extends ResponseCode {

    public static final ResponseCode MULTIPART_FILE_NULL = new FileResponseCode("01001", "上传的文件为空");
    public static final ResponseCode MULTIPART_FILE_NAME_BLANK = new FileResponseCode("01002", "上传的文件名为空");
    public static final ResponseCode MULTIPART_FILE_NAME_ILLEGAL =
            new FileResponseCode("01003", "上传的文件名不合规，文件名只能包含中文、字母和数字");
    public static final ResponseCode MULTIPART_FILE_EXTENSION_ILLEGAL =
            new FileResponseCode("01004", "上传的文件扩展名不合规，扩展名只能是JPG、JPEG、PNG、MP4");
    public static final ResponseCode UPLOAD_FILE_ERROR =
            new FileResponseCode("01005", "上传文件失败，请联系IT");


    private FileResponseCode(String errorCode, String message) {
        super(errorCode, message);
    }
}