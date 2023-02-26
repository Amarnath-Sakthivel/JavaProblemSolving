# Codility
You are given a list of names of new employees in a company. You need to generate a company email address for each of them.  
The name of ech person consists of two or three parts: First Name, Middle name, Last name. 

            Note: Last name should be truncated atmost 8 characters and should not contains "-".  
                
            Eg:John Doe;Peter Benjamin Parker; Mary Jane Watson-Parker;John Elvis Doe;John Evan Doe;Jane Doe;Peter Brian Parker 
            
            function should returns, 
                                John Doe <john.doe@example.com>; 
                                Peter Benjamin Parker <peter.parker@example.com>;
                                Mary Jane Watson-Parker <mary.watsonpa@example.com>; 
                                John Elvis Doe <john.doe2@example.com>; 
                                John Evan Doe <john.doe3@example.com>; 
                                Jane Doe <jane.doe@example.com>; 
                                Peter Brian Parker <peter.parker2@example.com>.
