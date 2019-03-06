package com.qfedu.action;

import com.qfedu.domain.Document;
import com.qfedu.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ShowAllDocumentsAction {
    @Autowired
    private DocumentService documentService;

    @RequestMapping(value = "getAllDocuments",method = RequestMethod.POST)
    @ResponseBody
    public List<Document> getAllDocuments() throws Exception{
        List<Document> documents = documentService.getAllDocument();
        System.out.println(documents);
        return documents;
    }

}
