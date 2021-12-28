# Core Spring TestApp using Java Configuration

## Requirement:<br />

There are different types of Performers, Performers come to auditorium and perform.<br />
When the program is run a variety of performers should be seen performing in auditorium.<br />

A Juggler is a Performer. When a Juggler is asked to perform, he juggles.A juggler needs<br />
rings to juggle. And he juggles that number of rings. Every juggler at a minimum juggles 3 rings.<br />

There are PoeticJugglers, when asked to perform a PoeticJuggler will recite a poem and will juggle<br />
the number of rings. A Poem is something that can be recited. PoeticJuggler has a Poem.<br />


## Steps to follow a spring based application:<br />

#### 0] Understand req, apply ooad, come up with class design.<br />
#### 1] create class definition as POJOS[follow Best Practices]<br />
          BestPractices:
                  a]code the pojos that does not belong to any library
                  b]code to the parent reference.
                  c]externalize all the dependencies.
                  d]override equals, hashcode and toString
#### 2]Configure Spring beans:<br />
          Configuration:
                  a]using xml
                  b]using annotations
#### 3]in main<br />
         a]start Spring container[dowloaded, available in jar files]
         b]pass the configuration to the Spring container.
         c]Spring container will look into configuration, identify all the pojos.
         d]Spring container will:
                            a]create object of the classes.
                            b]set the state.
                            c]wire the objects togather and keep it ready.
         e]Ask Spring container to handout instantiated, Dependency Injected, Autowired beans.<br />
         f]invoke behaviours.
                                  
         
         
         
         
         
         
         
         
         
         
         
         
         
         
