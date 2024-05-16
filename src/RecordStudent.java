//classi record le classi record vengono dichiarate un pò come un costruttre passando dei parametri tra parentesi divisi da una , la parte tra parentesi () è chiamata intestazione del record.
//per ogni componente dell'intestazione java genera un attributo privato con lo stesso nome e tipo,l'attributo è anche definitivo cioè non può essere modificato.
//java genera anche un metodo toString() per stampare tutti gli attributi in una stringa,viene generato anche un metodo  di accesso pubblico per ogni componente,questo metodo ha lo stesso nome del componente e dell'attributo ma non ha prefissi. come get
//il record deve essere immutabile perchè in alcuni casi si desidera proteggere dati da mutazioni involontarie.

public record RecordStudent(String id, String name, String dateOfBirth, String classList) {
}
