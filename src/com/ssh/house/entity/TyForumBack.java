package com.ssh.house.entity;



/**
 * TyForumBack entity. @author MyEclipse Persistence Tools
 */

public class TyForumBack  implements java.io.Serializable {


    // Fields    

     private String commentId;
     private TyForumTitle tyForumTitle;
     private TyEmployee tyEmployee;
     private String commentContent;
     private String replyId;


    // Constructors

    /** default constructor */
    public TyForumBack() {
    }

    
    /** full constructor */
    public TyForumBack(TyForumTitle tyForumTitle, TyEmployee tyEmployee, String commentContent, String replyId) {
        this.tyForumTitle = tyForumTitle;
        this.tyEmployee = tyEmployee;
        this.commentContent = commentContent;
        this.replyId = replyId;
    }

   
    // Property accessors

    public String getCommentId() {
        return this.commentId;
    }
    
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public TyForumTitle getTyForumTitle() {
        return this.tyForumTitle;
    }
    
    public void setTyForumTitle(TyForumTitle tyForumTitle) {
        this.tyForumTitle = tyForumTitle;
    }

    public TyEmployee getTyEmployee() {
        return this.tyEmployee;
    }
    
    public void setTyEmployee(TyEmployee tyEmployee) {
        this.tyEmployee = tyEmployee;
    }

    public String getCommentContent() {
        return this.commentContent;
    }
    
    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getReplyId() {
        return this.replyId;
    }
    
    public void setReplyId(String replyId) {
        this.replyId = replyId;
    }
   








}