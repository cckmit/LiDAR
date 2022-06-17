package com.lq.lidar.service.impl;

import com.lq.lidar.common.exception.ServiceException;
import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

@Service
public class CommonService {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${upload.path}")
    private String uploadPath;

    /**
     * 多文件上传
     *
     * @param files 文件列表
     */
    public void uploadFiles(List<MultipartFile> files) {
        if (CollectionUtils.isNotEmpty(files)) {
            files.forEach(file -> {
                String filepath = uploadPath + file.getOriginalFilename();
                try {
                    file.transferTo(new File(filepath));
                    logger.info("文件【{}】上传成功！", filepath);
                } catch (Exception e) {
                    logger.error("文件【{}】上传失败", filepath, e);
                    throw new ServiceException("文件上传失败!");
                }
            });
        }

    }
}
