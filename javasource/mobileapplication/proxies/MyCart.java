// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mobileapplication.proxies;

public class MyCart
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject myCartMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MobileApplication.MyCart";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Product_Name("Product_Name"),
		Product_Price("Product_Price"),
		Product_ID("Product_ID"),
		MyCart_Product("MobileApplication.MyCart_Product");

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

	public MyCart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MobileApplication.MyCart"));
	}

	protected MyCart(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject myCartMendixObject)
	{
		if (myCartMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MobileApplication.MyCart", myCartMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MobileApplication.MyCart");

		this.myCartMendixObject = myCartMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MyCart.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static mobileapplication.proxies.MyCart initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mobileapplication.proxies.MyCart.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mobileapplication.proxies.MyCart initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mobileapplication.proxies.MyCart(context, mendixObject);
	}

	public static mobileapplication.proxies.MyCart load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mobileapplication.proxies.MyCart.initialize(context, mendixObject);
	}

	public static java.util.List<mobileapplication.proxies.MyCart> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<mobileapplication.proxies.MyCart> result = new java.util.ArrayList<mobileapplication.proxies.MyCart>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MobileApplication.MyCart" + xpathConstraint))
			result.add(mobileapplication.proxies.MyCart.initialize(context, obj));
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
	 * @return value of Product_Name
	 */
	public final java.lang.String getProduct_Name()
	{
		return getProduct_Name(getContext());
	}

	/**
	 * @param context
	 * @return value of Product_Name
	 */
	public final java.lang.String getProduct_Name(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Product_Name.toString());
	}

	/**
	 * Set value of Product_Name
	 * @param product_name
	 */
	public final void setProduct_Name(java.lang.String product_name)
	{
		setProduct_Name(getContext(), product_name);
	}

	/**
	 * Set value of Product_Name
	 * @param context
	 * @param product_name
	 */
	public final void setProduct_Name(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String product_name)
	{
		getMendixObject().setValue(context, MemberNames.Product_Name.toString(), product_name);
	}

	/**
	 * @return value of Product_Price
	 */
	public final java.math.BigDecimal getProduct_Price()
	{
		return getProduct_Price(getContext());
	}

	/**
	 * @param context
	 * @return value of Product_Price
	 */
	public final java.math.BigDecimal getProduct_Price(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Product_Price.toString());
	}

	/**
	 * Set value of Product_Price
	 * @param product_price
	 */
	public final void setProduct_Price(java.math.BigDecimal product_price)
	{
		setProduct_Price(getContext(), product_price);
	}

	/**
	 * Set value of Product_Price
	 * @param context
	 * @param product_price
	 */
	public final void setProduct_Price(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal product_price)
	{
		getMendixObject().setValue(context, MemberNames.Product_Price.toString(), product_price);
	}

	/**
	 * @return value of Product_ID
	 */
	public final java.lang.Long getProduct_ID()
	{
		return getProduct_ID(getContext());
	}

	/**
	 * @param context
	 * @return value of Product_ID
	 */
	public final java.lang.Long getProduct_ID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.Product_ID.toString());
	}

	/**
	 * Set value of Product_ID
	 * @param product_id
	 */
	public final void setProduct_ID(java.lang.Long product_id)
	{
		setProduct_ID(getContext(), product_id);
	}

	/**
	 * Set value of Product_ID
	 * @param context
	 * @param product_id
	 */
	public final void setProduct_ID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long product_id)
	{
		getMendixObject().setValue(context, MemberNames.Product_ID.toString(), product_id);
	}

	/**
	 * @return value of MyCart_Product
	 */
	public final mobileapplication.proxies.Product getMyCart_Product() throws com.mendix.core.CoreException
	{
		return getMyCart_Product(getContext());
	}

	/**
	 * @param context
	 * @return value of MyCart_Product
	 */
	public final mobileapplication.proxies.Product getMyCart_Product(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mobileapplication.proxies.Product result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MyCart_Product.toString());
		if (identifier != null)
			result = mobileapplication.proxies.Product.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MyCart_Product
	 * @param mycart_product
	 */
	public final void setMyCart_Product(mobileapplication.proxies.Product mycart_product)
	{
		setMyCart_Product(getContext(), mycart_product);
	}

	/**
	 * Set value of MyCart_Product
	 * @param context
	 * @param mycart_product
	 */
	public final void setMyCart_Product(com.mendix.systemwideinterfaces.core.IContext context, mobileapplication.proxies.Product mycart_product)
	{
		if (mycart_product == null)
			getMendixObject().setValue(context, MemberNames.MyCart_Product.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MyCart_Product.toString(), mycart_product.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return myCartMendixObject;
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
			final mobileapplication.proxies.MyCart that = (mobileapplication.proxies.MyCart) obj;
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
		return "MobileApplication.MyCart";
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