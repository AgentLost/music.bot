package music.bot.database;

public class MongoDbDataSource implements DatabaseManager {
    @Override
    public String getPrefix(long guildId) {
        return null;
    }

    @Override
    public void setPrefix(long guildId, String newPrefix) {

    }
}
