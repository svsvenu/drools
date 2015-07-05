package com.venu.drools; 

import java.util.ArrayList;
import java.util.List;

import org.drools.KnowledgeBase;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatelessKnowledgeSession;
 
 
public class AccountTest {
    public static final void main(String[] args) {
        KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        kbuilder.add(ResourceFactory.newClassPathResource("myrule.drl"), ResourceType.DRL);
        KnowledgeBase kbase = kbuilder.newKnowledgeBase();
        StatelessKnowledgeSession ksession = kbase.newStatelessKnowledgeSession();
     //   Account account = new Account(200);
     //   account.withdraw(150);
        
     //   ksession.
        ksession.execute(buildAccounts());
 
    }
    
    private static List<Account> buildAccounts() {
    	
    	ArrayList<Account> accounts = new ArrayList<Account>();
    	
    	Account acc1 = new Account(150);
    	Account acc2 = new Account(00);

    	accounts.add(acc1);
    	accounts.add(acc2);
    	
    	return accounts;
    }
}