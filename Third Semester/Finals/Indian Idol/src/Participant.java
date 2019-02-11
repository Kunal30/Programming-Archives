
public class Participant {
    Object rn;
	Participant next;
	int ptime;
	int twait;
	int tservice;
public Participant(Object obj)
{
	rn=obj;
	next=null;
	ptime=Mall.p_time;
	twait=Mall.t_wait;
	tservice=Mall.t_service;
}

}
