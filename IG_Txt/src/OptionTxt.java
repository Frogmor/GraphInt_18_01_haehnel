import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionTxt{
	 JFrame frame = new JFrame("Entrée");
	 String name = JOptionPane.showInputDialog(frame, "Saisir le nom du client :", "Entrée");
//	 String name2 = JOptionPane.showInputDialog(frame, "Saisir le nom du client :", "Recherche d'un client", JOptionPane.WARNING_MESSAGE);

	 public static final String[] noms = {"jean machin", "jean machine", "jeane machin", "jeane machine"};
//	 String nameChose = (String) JOptionPane.showInputDialog(frame,"Selectionner le Client","Recherche client",JOptionPane.WARNING_MESSAGE,null,noms,noms[0]);
	 
	 
	 public void SearchName(String s){
		 boolean Found=false;
		 for (int i = 0; i < noms.length; i++){
			 if (noms[i].equals(s)){
				 Found=true;
			 }
		 }
		 if (Found==true){
			 JOptionPane.showMessageDialog(frame,
					    "Le client existe",
					    "Recherche d'un client",
					    JOptionPane.INFORMATION_MESSAGE);
		 }else{
			 JOptionPane.showMessageDialog(frame,
					    "Le client est introuvable",
					    "Recherche d'un client",
					    JOptionPane.WARNING_MESSAGE);
		 }
	 }
	 public void onClose(){
		 JOptionPane.showConfirmDialog(null, "voulez vous quitter sans sauvegarder?", "Fermeture de l'application", JOptionPane.YES_NO_OPTION);
	 }
}
