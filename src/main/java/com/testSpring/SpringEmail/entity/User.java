package com.testSpring.SpringEmail.entity;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (User)表实体类
 *
 * @author makejava
 * @since 2019-11-09 16:47:46
 */
@Data
@NoArgsConstructor
@SuppressWarnings("serial")
public class User extends Model<User> {

    @TableId(type = IdType.AUTO)
        
    private Integer id;

    
        
    private String name;

    
        
    private String password;

    
        
    private Integer activecode;

    
        
    private String email;
}