Core Spring TestApp

Requirement:<br />

There are different types of Persformers, Performers come to auditorium and perform.<br />
When the program is run a variety of performers should be seen performing in auditorium.<br />

A Juggler is a Performer. When a Juggler is asked to perform, he juggles.A juggler needs<br />
rings to juggle. And he juggles that number of rings. Every juggler at a minimum juggles 3 rings.<br />

There are PoeticJugglers, when asked to perform a PoeticJuggler will recite a poem and will juggle<br />
the number of rings. A Poem is something that can be recited. PoeticJuggler has a Poem.<br />


Steps to follow a spring based application:<br />

0] Understand req, apply ooad, come up with class design.<br />
1] create class definition as POJOS[follow Best Practices]<br />
         BestPractices:<br />
                  a]code the pojos that does not belong to any library<br />
                  b]code to the parent reference.<br />
                  c]externalize all the dependencies.<br />
                  d]override equals, hashcode and toString<br />
2]Configure Spring beans:<br />
         Configuration:<br />
                  a]using xml<br />
                  b]using annotations<br />
3]in main<br />
         a]start Spring container[dowloaded, available in jar files]<br />
         b]pass the configuration to the Spring container<br />
         c]Spring container will look into configuration, identify all the pojos.<br />
         d]Spring container will:<br />
                            a]create object of the classes.<br />
                            b]set the state.<br />
                            c]wire the objects togather and keep it ready.<br />
         e]Ask Spring container to handout instantiated, Dependency Injected, Autowired beans.<br />
         f]invoke behaviours  <br />
         <br />
                                  
         
         
         
         
         
         
         
         
         
         
         
         
         
         
