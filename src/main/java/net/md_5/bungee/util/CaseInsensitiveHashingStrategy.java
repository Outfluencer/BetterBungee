package net.md_5.bungee.util;

import gnu.trove.strategy.HashingStrategy;
import java.util.Locale;

@SuppressWarnings("rawtypes")
class CaseInsensitiveHashingStrategy implements HashingStrategy
{

    /**
	 * 
	 */
	private static final long serialVersionUID = -5952346532346171533L;
	static final CaseInsensitiveHashingStrategy INSTANCE = new CaseInsensitiveHashingStrategy();

    public int computeHashCode(Object object)
    {
        return ( (String) object ).toLowerCase( Locale.ROOT ).hashCode();
    }

    public boolean equals(Object o1, Object o2)
    {
        return o1.equals( o2 ) || ( o1 instanceof String && o2 instanceof String && ( (String) o1 ).toLowerCase( Locale.ROOT ).equals( ( (String) o2 ).toLowerCase( Locale.ROOT ) ) );
    }
}
