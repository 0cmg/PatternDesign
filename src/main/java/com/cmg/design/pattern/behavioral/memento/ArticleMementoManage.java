package com.cmg.design.pattern.behavioral.memento;

import java.util.Stack;

/**
 * @ClassName ArticleMementoManage
 * @Author cmg
 * @Date 2020/6/6 17:14
 * @Description TODO
 **/
public class ArticleMementoManage {
    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<>();
    public ArticleMemento getMemento(){
        ArticleMemento articleMemento = ARTICLE_MEMENTO_STACK.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento){
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }
}
