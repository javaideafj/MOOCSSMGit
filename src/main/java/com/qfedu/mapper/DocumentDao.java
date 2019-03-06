package com.qfedu.mapper;

import com.qfedu.domain.Document;
import org.apache.ibatis.annotations.Delete;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentDao {

//   @Select({"select d.id,d.name,u.nickname,u.username,u.userType,d.uploadDate,c.bigName,c.smallName kindName from document d, userInfo u,classify c where d.uploadUser = u.username and d.kind = c.id"})
    public List<Document> selectAllDocument() throws Exception;

    @Delete("delete from document where id = #{id}")
    public void deleteDocumentById(Integer id) throws Exception;

//  /* @Insert("insert into document(name,kind,uploadUser,uploadTime,keyle,url,summary) values(#{name},#{kind},#{uploadUser},#{uploadTime},#{keyle},#{url},#{summary});")
//    public*/ abstract int insertDocument(Document document);
}
