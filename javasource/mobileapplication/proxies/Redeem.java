// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mobileapplication.proxies;

public class Redeem
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject redeemMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MobileApplication.Redeem";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		RedeemPoints("RedeemPoints"),
		Redeem_Product("MobileApplication.Redeem_Product");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Redeem(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MobileApplication.Redeem"));
	}

	protected Redeem(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject redeemMendixObject)
	{
		if (redeemMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MobileApplication.Redeem", redeemMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MobileApplication.Redeem");

		this.redeemMendixObject = redeemMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Redeem.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static mobileapplication.proxies.Redeem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mobileapplication.proxies.Redeem.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mobileapplication.proxies.Redeem initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mobileapplication.proxies.Redeem(context, mendixObject);
	}

	public static mobileapplication.proxies.Redeem load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mobileapplication.proxies.Redeem.initialize(context, mendixObject);
	}

	public static java.util.List<mobileapplication.proxies.Redeem> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<mobileapplication.proxies.Redeem> result = new java.util.ArrayList<mobileapplication.proxies.Redeem>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MobileApplication.Redeem" + xpathConstraint))
			result.add(mobileapplication.proxies.Redeem.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of RedeemPoints
	 */
	public final java.lang.Integer getRedeemPoints()
	{
		return getRedeemPoints(getContext());
	}

	/**
	 * @param context
	 * @return value of RedeemPoints
	 */
	public final java.lang.Integer getRedeemPoints(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.RedeemPoints.toString());
	}

	/**
	 * Set value of RedeemPoints
	 * @param redeempoints
	 */
	public final void setRedeemPoints(java.lang.Integer redeempoints)
	{
		setRedeemPoints(getContext(), redeempoints);
	}

	/**
	 * Set value of RedeemPoints
	 * @param context
	 * @param redeempoints
	 */
	public final void setRedeemPoints(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer redeempoints)
	{
		getMendixObject().setValue(context, MemberNames.RedeemPoints.toString(), redeempoints);
	}

	/**
	 * @return value of Redeem_Product
	 */
	public final mobileapplication.proxies.Product getRedeem_Product() throws com.mendix.core.CoreException
	{
		return getRedeem_Product(getContext());
	}

	/**
	 * @param context
	 * @return value of Redeem_Product
	 */
	public final mobileapplication.proxies.Product getRedeem_Product(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mobileapplication.proxies.Product result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Redeem_Product.toString());
		if (identifier != null)
			result = mobileapplication.proxies.Product.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Redeem_Product
	 * @param redeem_product
	 */
	public final void setRedeem_Product(mobileapplication.proxies.Product redeem_product)
	{
		setRedeem_Product(getContext(), redeem_product);
	}

	/**
	 * Set value of Redeem_Product
	 * @param context
	 * @param redeem_product
	 */
	public final void setRedeem_Product(com.mendix.systemwideinterfaces.core.IContext context, mobileapplication.proxies.Product redeem_product)
	{
		if (redeem_product == null)
			getMendixObject().setValue(context, MemberNames.Redeem_Product.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Redeem_Product.toString(), redeem_product.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return redeemMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final mobileapplication.proxies.Redeem that = (mobileapplication.proxies.Redeem) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MobileApplication.Redeem";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
